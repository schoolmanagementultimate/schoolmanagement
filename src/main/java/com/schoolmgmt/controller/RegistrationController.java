package com.schoolmgmt.controller;

import java.util.LinkedList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.schoolmgmt.beans.Registration;

/**
 * 
 * @author RAMA
 * <p> Controller class for School Management Registration page</p> 
 */
@Controller
@RequestMapping(value = "/register")
public class RegistrationController {

	/*
	 * @RequestMapping(method = RequestMethod.GET) public ModelAndView hello(){
	 * return new ModelAndView("home"); }
	 */

	@RequestMapping(method = RequestMethod.GET)
	public ModelAndView registration() {
		ModelAndView modelAndView = new ModelAndView("register");
		Registration registration = new Registration();
		modelAndView.addObject("registrationValues", registration);
		return modelAndView;
	}

	@RequestMapping(method = RequestMethod.POST)
	public ModelAndView registration(@ModelAttribute("registrationValues") Registration registration) {
		System.out.println(registration.getName().concat(registration.getContactNo()).concat(registration.getArea())
				.concat(registration.getSelectedCountry()));
		ModelAndView modelAndView = new ModelAndView("home");
		return modelAndView;
	}

	// TODO need to populate actual country List.
	@ModelAttribute("countryList")
	public List<String> countryList() {
		List<String> list = new LinkedList<String>();
		list.add("India");
		return list;
	}
}
