package com.ticktick.springbootapp;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class LoginController {
	
	@Autowired
	private LoginDao loginDao;
	
	@GetMapping("/auth")
	public String showLogin(HttpServletRequest req) {
		req.setAttribute("message", "Please wait , I am coming!");
		return  "login";
	}
	
	@PostMapping("/auth")
	public String validate(HttpServletRequest req) {
		String username=req.getParameter("username");
		String password=req.getParameter("password");
		String role=loginDao.checkUser(username,password);
		if("unknown".equalsIgnoreCase(role)) {
			req.setAttribute("message", "Sorry your username and password are not correct!");
		}else {
		    req.setAttribute("message", "You are most welcome , role = "+role);
		}	
		return  "login";
	}

}
