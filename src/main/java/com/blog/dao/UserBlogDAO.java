package com.blog.dao;

import java.util.List;

import org.hibernate.SQLQuery;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Repository;

import com.blog.domain.Blog;
import com.blog.domain.User;
import com.blog.dto.BlogDTO;
import com.blog.dto.UserDTO;

@Repository
public class UserBlogDAO implements IUserBlogDAO {

	@Autowired
	SessionFactory sessionFactory;

	@Autowired
	PasswordEncoder passwordEncoder;

	@Override
	public void createUser(UserDTO userdto) {
		Session session = sessionFactory.getCurrentSession();
		Transaction tx = session.getTransaction();
		User user = new User();
		user.setName(userdto.getUsername());
		user.setEmail(userdto.getEmail());
		user.setPassword(passwordEncoder.encode(userdto.getPassword()));
		session.save(user);
		session.flush();
		tx.commit();
		session.close();
	}

	@Override
	public UserDTO login(UserDTO userDTO) {
		UserDTO loginStatus = new UserDTO();
		Session session = sessionFactory.getCurrentSession();
		Transaction tx = session.beginTransaction();
		User user = new User();
		user.setName(userDTO.getUsername());
		user.setPassword(user.getPassword());
		SQLQuery query = session.createSQLQuery("select id from user where name='" + userDTO.getUsername()
				+ "'and password='" + userDTO.getPassword() + "'");
		List<User> users = query.list();
		if (users.size() != 0) {
			loginStatus.setLoginStatus(1);
		}
		return loginStatus;
	}

	@Override
	public void addBlog(BlogDTO blogDto) {
		
		Blog blog = new Blog();
		blog.setDescription(blogDto.getDescription());
		blog.setTitle(blogDto.getTitle());
		//blog.setUser(user);
	}

}
