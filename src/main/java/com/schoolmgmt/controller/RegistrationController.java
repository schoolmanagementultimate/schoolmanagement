package com.schoolmgmt.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping(value = "/register")
public class RegistrationController {

	@RequestMapping(method = RequestMethod.GET)
	public ModelAndView hello(){
		return new ModelAndView("home");
	}
	
}
