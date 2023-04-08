package com.adriana.loginandreg.controllers;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {

	public MainController() {
		// TODO Auto-generated constructor stub
	}
	
	@GetMapping("/")
	public String home(HttpSession session) {
		if(session.getAttribute("user_id") == null) {
			return "redirect:/users/login/reg";
		}
		return "main/dashboard.jsp";
		
	}
}
