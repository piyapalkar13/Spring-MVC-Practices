package com.pro.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class BroController {

	@ResponseBody
	//handler method
	@RequestMapping("cricketbat")
	public String giveCricketBat()
	{
		return "hey man..this is your cricket bat";
	}
}
