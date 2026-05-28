package com.kh.semiprj.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class CountryController3 {


	@RequestMapping("/test")
	public String test() {

		return "test";
	}


	@RequestMapping("/list")
	public String list() {

		return "country/list";
	}
	

	@RequestMapping("/conflict")
	public String conflict() {
		return "저 왜 충돌이 안나요1234";
	}

}
