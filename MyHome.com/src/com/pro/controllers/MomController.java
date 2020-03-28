package com.pro.controllers;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

//both annoations works as same
//@Component
@Controller
public class MomController {

	@ResponseBody
	@RequestMapping("/sugar")
	public String giveSugar()
	{
		return "Hey,Here is your sugar";
		
	}
}
