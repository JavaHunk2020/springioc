package com.ticktick.springbootapp;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class WelcomeController {
	
	@GetMapping("/well")
	public String showPage() {
		return "welcome"; //welcome.jsp
	}
	
	@GetMapping("/greet")
	public String greet(HttpServletRequest req) {
		String name=req.getParameter("name");
		 if(name.length()==0) {
			 req.setAttribute("pname", "Your name is blank!");
		 }else {
			 req.setAttribute("pname", name);	 
		 }
		
		return "success"; //success.jsp
	}

}
