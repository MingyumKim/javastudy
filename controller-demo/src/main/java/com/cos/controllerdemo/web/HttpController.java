package com.cos.controllerdemo.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

//@Controller //File 응답 
@RestController //Data 응답 
public class HttpController {

	@GetMapping("/get")
	public String get() {
		return "<h1>get요청 됌</h1>";
	}
	
	@PostMapping("/post")
	public String post() {
		return "post요청 됌";
	}
	
	@PutMapping("/put")
	public String put() {
		return "put요청 됌";
	}
	
	@DeleteMapping("/delete")
	public String delete() {
		return "delete요청 됌";
	}
}
