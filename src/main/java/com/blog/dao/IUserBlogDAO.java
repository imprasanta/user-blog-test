package com.blog.dao;

import com.blog.dto.BlogDTO;
import com.blog.dto.UserDTO;

public interface IUserBlogDAO {

	void createUser(UserDTO user);

	UserDTO login(UserDTO user);

	void addBlog(BlogDTO blogDto);


}
