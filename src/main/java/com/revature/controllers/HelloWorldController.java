package com.revature.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@CrossOrigin
@Controller
public class HelloWorldController {
	
	@RequestMapping(method=RequestMethod.GET, value="/home")
	@ResponseBody
	public String returnHomePage() {
		System.out.println("hahahahaahahah");
		return "Hello World";
	}
}
