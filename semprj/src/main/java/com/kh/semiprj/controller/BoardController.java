package com.kh.semiprj.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/board")
public class BoardController {
	//정영웅
	int boardId;
	
	@RequestMapping("/list")
	public String list () {
		return "list";
	}
}
