package com.kh.semiprj.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController { 

	@RequestMapping("/")
	public String home() {
		//return "Jenkins install complete!";
		return "Edit code";
	}
	
}
