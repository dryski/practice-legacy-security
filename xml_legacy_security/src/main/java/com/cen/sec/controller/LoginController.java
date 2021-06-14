package com.cen.sec.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class LoginController {
	
	@GetMapping("/login")
	public String login() {
		return "login";
	}
	
	@PostMapping("/perform_register")
	public void performRegister() {
		
	}

	@GetMapping("/homepage")
	public String homepage() {
		return "homepage";
	}
	
	@GetMapping("/register")
	public String register() {
		return "signUp";
	}
	
	@GetMapping("/admin")
	public String adminPage() {
		return "adminpage";
	}
}
