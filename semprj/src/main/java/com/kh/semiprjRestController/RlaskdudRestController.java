package com.kh.semiprjRestController;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

public class RlaskdudRestController {
	@Controller
	public class HomeController {
		@RequestMapping("/")
		public String home() {
			return "rlaskdud";
		}
}
}
