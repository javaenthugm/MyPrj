package com.gk.study.java.spring.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.gk.study.java.spring.services.UserServices;

@Controller
public class UsersController {
	

    @Autowired
	private UserServices usrvs;

	@RequestMapping("/create")
	public String creatUser() {
		System.out.println("Inside the controller");
		return "createuser";
	}

	@RequestMapping(value = "/getUsers", method = RequestMethod.GET, produces = "application/json")
	public @ResponseBody String getUsers() {
		return usrvs.getAllUsers();
	}

	public UserServices getUsrvs() {
		return usrvs;
	}

	public void setUsrvs(UserServices usrvs) {
		this.usrvs = usrvs;
	}
	
	@RequestMapping("/home")
	public ModelAndView getHomepage() {
		System.out.println("Returning home page");
		return new ModelAndView("index","message","Welcome Home!!");
	}

	
}
