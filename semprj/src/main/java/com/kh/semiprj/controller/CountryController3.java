package com.kh.semiprj.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CountryController3 {


	@RequestMapping("/list")
	public String list() {

		return "country/list12";
	}
	

	@RequestMapping("/conflict")
	public String conflict() {
		return "저 왜 충돌이 안나요1234";
	}

}
