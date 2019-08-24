package com.blog.service;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.blog.dao.IUserBlogDAO;
import com.blog.dto.BlogDTO;
import com.blog.dto.UserDTO;

@Service

public class UserBlogService implements IUserBlogService {

	@Autowired
	IUserBlogDAO userBlogDAO;

	@Override
	@Transactional
	public void createUser(UserDTO user) {
		userBlogDAO.createUser(user);
	}

	@Override
	public void login(UserDTO user) {
		userBlogDAO.login(user);
	}

	@Override
	public void addBlog(BlogDTO blogDto) {
		userBlogDAO.addBlog(blogDto);
	}

}
