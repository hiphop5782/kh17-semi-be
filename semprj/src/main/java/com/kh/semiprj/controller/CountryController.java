package com.kh.semiprj.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CountryController {
	@RequestMapping("/country")
	public String country() {
		return "대한민국";
	}
}
