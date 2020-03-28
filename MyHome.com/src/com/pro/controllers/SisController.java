package com.pro.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/sis")
public class SisController {

	@ResponseBody
	@RequestMapping("/makeup")
	public String giveMakeupKit()
	{
		return "just take my makeup kit..";
	}
	
	@ResponseBody
	@RequestMapping("/book")
	public String getBooks()
	{
		return "Math book";
		
	}
}
