package com.kh.semiprj.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CountryController2 {


	@RequestMapping("/one")
	public String list() {

		return "one";
	}

}
