package com.herb.controller;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.herb.domain.User;
import com.herb.service.UserService;

@RestController
@RequestMapping(value="/loginedUser")
public class LoginedUserRestController {
	private static Logger logger = LogManager.getLogger(LoginedUserRestController.class);
	
	@Autowired
	private UserService userService;
	
    public UserService getUserService() {
		return userService;
	}

	public void setUserService(UserService userService) {
		this.userService = userService;
	}

	@RequestMapping(value="/{id}", method=RequestMethod.GET)
    public User getUser(@PathVariable Long id) {
    	logger.info("getUser start "+id);
		return userService.quertUser(id);
    }
}