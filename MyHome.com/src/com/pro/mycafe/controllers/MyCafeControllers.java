package com.pro.mycafe.controllers;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MyCafeControllers {

	@RequestMapping("/cafe")
	public String showWelcomePage(Model model)
	{
		//sending data to view page(.jsp)
		String name="Priyanka";
		model.addAttribute("myNameValue", name);
		model.addAttribute("myWebsiteTitle", "Mom's Cafe");
		
		return "welcome-page";
	}
	
	@RequestMapping("/process-order")
	public String processOrder(HttpServletRequest request,Model model)
	{
		//handle the data received from the user
		String userEnteredValue=request.getParameter("foodType");
		
		//set the data with model object and send it to view
		model.addAttribute("userInput",userEnteredValue);
		return "process-order";	
	}
}
