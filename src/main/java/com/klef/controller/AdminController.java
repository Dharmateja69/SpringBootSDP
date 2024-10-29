package com.klef.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class AdminController {

	
	
	@GetMapping("/AdminLogin")
	public ModelAndView dminLogin() {
		ModelAndView mv = new ModelAndView("Alogin");
		return mv;
	}
	
}
