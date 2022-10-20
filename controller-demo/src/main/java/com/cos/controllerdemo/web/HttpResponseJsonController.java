package com.cos.controllerdemo.web;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cos.controllerdemo.domain.User;

@RestController
public class HttpResponseJsonController {

	@GetMapping("/resp/json")
	public String respJson() {
		return "{\n"
				+ "    \"name\" : \"testuser\"\n"
				+ "}";
	}
	
	
	@GetMapping("resp/json/object")
	public String restJsonObject() {
		
		User user = new User();
		user.setName("alsrua");
		
		String data = "{\"username\" :\" "+user.getName()+"\"}";
		
		return data;
	}
	
	@GetMapping("resp/json/javaobject")
	public User restJsonJavaObject() {
		
		User user = new User();
		user.setName("alsrua");
		
		return user; // 1. MessageConvertor 가 자동으로 JavaObject를 Json으로 변경해서 통신해
		// 2. RestControll 일때만 MessageConvert가 작
	}
}
