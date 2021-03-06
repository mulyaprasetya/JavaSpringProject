package com.xsispra.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class DefaultController {

	@RequestMapping("/")
	public String dashboard() {
		return "homePage";
	}
	
	@RequestMapping("/login")
	public String login() {
		return "loginPage";
	}
	
	@RequestMapping("/profile")
	public String profile() {
		return "profile/profile";
	}
	
}
