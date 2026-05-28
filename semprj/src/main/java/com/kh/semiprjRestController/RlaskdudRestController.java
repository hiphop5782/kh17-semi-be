package com.kh.semiprjRestController;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

public class RlaskdudRestController {
	@RestController
	@RequestMapping("/")
	public class rlaskdudRestController {
		public String home() {
			return "rlaskdud";
		}
}
}
