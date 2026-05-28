package com.kh.semiprj.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestControllerLee {

	@RequestMapping("/")
	public String home() {
		return "Hello~";
	}
	
}
