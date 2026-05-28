package com.kh.semiprj.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class CountryController3 {


	@RequestMapping("/test")
	public String list() {

		return "test";
	}
}
