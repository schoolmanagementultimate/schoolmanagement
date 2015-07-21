package com.schoolmgmt.controller;

import java.util.LinkedList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.schoolmgmt.beans.RegistrationBean;

/**
 * 
 * @author RAMA
 * <p>Controller class for School Management Registration page.</p> 
 */
@Controller
@RequestMapping(value = "/register")
public class RegistrationController {

	static Logger logger = LoggerFactory.getLogger(RegistrationController.class);
	
	private RegistrationBean registration;
	
	@Autowired
	public void setRegistrationBean(RegistrationBean registration){
		this.registration = registration;
	}

	@RequestMapping(method = RequestMethod.GET)
	public ModelAndView registration() {
		logger.info("In Registration method");
		ModelAndView modelAndView = new ModelAndView("register");
		modelAndView.addObject("registrationValues", registration);
		return modelAndView;
	}

	@RequestMapping(method = RequestMethod.POST)
	public ModelAndView registration(@ModelAttribute("registrationValues") RegistrationBean registration) {
		logger.info(registration.getName().concat(registration.getContactNo()).concat(registration.getArea())
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
	
	// TODO need to populate actual syllabus List.
	@ModelAttribute("syllabusList")
	public List<String> syllabusList() {
		List<String> list = new LinkedList<String>();
		list.add("Matriculation");
		list.add("CBSE");
		list.add("ICSE");
		list.add("State Board");
		return list;
	}
}
