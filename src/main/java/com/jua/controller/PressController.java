package com.jua.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PressController {
	@GetMapping("/doc")
	public String docLanding() {
		return "doc";
	}

	@GetMapping("/template")
	public String template() {
		return "template";
	}

}
