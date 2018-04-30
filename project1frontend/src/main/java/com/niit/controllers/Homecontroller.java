package com.niit.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
@Controller
public class Homecontroller {
	public Homecontroller(){
		System.out.println("HomeController bean is created");
	}
	@RequestMapping("/login")
	public String loginPage(@RequestParam(required=false) String error,@RequestParam(required=false) String logout,Model model){
		if(error!=null)
		model.addAttribute("error","Invalid Username/Password");
		if(logout!=null)
			model.addAttribute("msg","Loggedout successfully");
		return "login";
	}

	
	//This a handler method
	//It can handle the request "http://localhost:8080/project1frontend/home -> DispatcherServlet -> "home"->
	// /WEB-INF/views/home.jsp
	@RequestMapping(value="/home")
	public String getHomePage(){
		return "home";
	}
	/*@RequestMapping(value="/header")
	public String getHeaderPage(){
		return "header";
	}*/
}
