package com.sst.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class UserController {

	@GetMapping("/user")
	public ModelAndView getUser()
	{
		ModelAndView mav=new ModelAndView();
		mav.addObject("name","aman");
		mav.addObject("email","am@gmail.com");
		mav.addObject("phno","28393");
		mav.setViewName("index");
		return mav;
	}
}
