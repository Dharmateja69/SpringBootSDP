package com.klef.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.servlet.ModelAndView;

import com.klef.model1.Customer;
import com.klef.service.CustomerServiceImpl;

import jakarta.servlet.http.HttpServletRequest;

import org.springframework.web.bind.annotation.PostMapping;



@Controller
public class CustomerController {
	
	@Autowired
	private CustomerServiceImpl CS;
	@GetMapping("/")
	public ModelAndView home() {
		ModelAndView mv = new ModelAndView("home");
		return mv;
	}
	
	@GetMapping("/Cregistration")
	public ModelAndView CustomerRegistration() {
		ModelAndView mv = new ModelAndView("Cregistration");
		return mv;
		
	}
	
	@GetMapping("/Clogin")
	public ModelAndView CustomerLogin() {
		ModelAndView mv = new ModelAndView("Clogin");
		return mv;
	}
	
	@PostMapping("/insertcustomer")
	public ModelAndView  insertcustomer(HttpServletRequest request) {
		//TODO: process POST request
		String name= request.getParameter("cname");
	    String gender= request.getParameter("cgender");
		String dob= request.getParameter("cdob");
		String email= request.getParameter("cemail");
		String password= request.getParameter("cpwd");
		String location= request.getParameter("cloc");
		String contact= request.getParameter("ccn");
		
		Customer c = new Customer();
		c.setName(name);
		c.setGen(gender);
		c.setDob(dob);
		c.setEmail(email);
		c.setPass(password);
		c.setLoc(location);
		c.setContacno(contact);
		
		String message= CS.CustomerRegistration(c);
		ModelAndView mv = new ModelAndView("registredsuccessful");
		mv.addObject("message", message);
		
		
		return mv;
	}
	
	
	
	

}
