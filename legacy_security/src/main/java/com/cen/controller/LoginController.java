package com.cen.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class LoginController {
	
	@GetMapping("/login")
	public String login() {
		return "login.jsp";
	}
	
	@GetMapping("/homepage")
	public String homepage() {
		return "homepage.jsp";
	}
}
