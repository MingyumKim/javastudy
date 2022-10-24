package com.cos.controllerdemo.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HttpRedirectionController {
	
	@GetMapping("/home1")
	public String home() {
		return "home1";
	}
	
	@GetMapping("/away1")
	public String away() {
		return "redirect:/home1"; //controller에서만 rest는 안
	}

}
