package com.cos.controllerdemo.web;

import javax.annotation.PostConstruct;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.cos.controllerdemo.domain.User;

@RestController
public class HttpBodyController {
	
	
	private static final Logger log = LoggerFactory.getLogger(HttpBodyController.class);


	@PostMapping("/body1")
	public String xwwwformrulencoded(String username) {
		
		log.info("username : " + username);
		
		return "key = value";
	}
	
	@PostMapping("/body2")
	public String plaintext(@RequestBody String text) {
		log.info(text);
		return "plain/text";
	}
	
	@PostMapping("/body3")
	public String applicatioinjson(@RequestBody String data) {
		log.info(data);
		
		return "json";
	}
	
	@PostMapping("/body4")
	public String applicatioinjsonToObject(@RequestBody User user) {
		log.info(user.getName());
		
		return "json";
	}

}
