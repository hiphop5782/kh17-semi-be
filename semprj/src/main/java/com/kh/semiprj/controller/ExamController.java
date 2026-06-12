package com.kh.semiprj.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ExamController {
	@RequestMapping("/exam")
	public String exam () {
		return "exam";
	}
}
