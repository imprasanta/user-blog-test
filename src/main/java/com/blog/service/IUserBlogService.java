package com.blog.service;

import com.blog.dto.BlogDTO;
import com.blog.dto.UserDTO;

public interface IUserBlogService {

	void createUser(UserDTO user);
	
	void login(UserDTO user);

	void addBlog(BlogDTO blogDTO);

}
