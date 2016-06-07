package com.herb.controller;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class LoginController {
	private static Logger logger = LogManager.getLogger(LoginController.class);
	@RequestMapping("/login")
	private String login(){
		logger.info("start to login");
		return "home";
	}
}
//测试提交远程代码
//测试提交远程代码22