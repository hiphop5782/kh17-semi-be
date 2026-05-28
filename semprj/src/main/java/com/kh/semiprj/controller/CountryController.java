package com.kh.semiprj.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CountryController {
	@RequestMapping("/conflict")
	public String conflict() {
		return "conflict test";
	}

	@RequestMapping("/country")
	public String country() {
		return "country";
	}
}
