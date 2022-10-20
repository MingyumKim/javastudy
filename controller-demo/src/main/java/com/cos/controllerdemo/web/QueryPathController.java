package com.cos.controllerdemo.web;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class QueryPathController {

	@GetMapping("/chicken")
	public String chickenQuery(String type) {
		return type + "쿼리스트링 응답완료";
	}
	
	@GetMapping("/chicken/{type}")
	public String chickenPath(@PathVariable String type) {
		return type + "주소변수매핑 응답완료";
	}
}
