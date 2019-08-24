package com.blog.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.blog.dto.BlogDTO;
import com.blog.dto.UserDTO;
import com.blog.service.IUserBlogService;

@RestController
@RequestMapping("/accubits")
public class UserBlogController {

	Logger userLogger = LoggerFactory.getLogger(UserBlogController.class);
	@Autowired
	IUserBlogService userBlogService;

	@RequestMapping(value = "/registeruser", method = RequestMethod.POST)
	public void createUser(@RequestBody UserDTO user) {
		userLogger.debug("registeruser::start", new Object[] { user });
		try {
			userBlogService.createUser(user);
		} catch (Exception e) {
			e.printStackTrace();
		}
		userLogger.debug("registeruser::end");
	}

	@RequestMapping(value = "/addblog",method = RequestMethod.POST)
	public void addBlog(BlogDTO blogDTO) {
		userBlogService.addBlog(blogDTO);
	}

	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public void login(@RequestBody UserDTO user) {
		userLogger.debug("login::start", new Object[] { user });
		try {
			userBlogService.login(user);
		} catch (Exception e) {
			e.printStackTrace();
		}
		userLogger.debug("login::end");
	}
}
