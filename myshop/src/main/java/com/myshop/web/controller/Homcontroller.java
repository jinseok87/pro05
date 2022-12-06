package com.myshop.web.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Homcontroller {
	@RequestMapping("/index")
	public String index() {
		return "home.index";
	}
	@RequestMapping("/help")
	public String aaa() {
		
		return "home.help";
	}
	
	
}
