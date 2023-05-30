package com.klinnovations.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetController {
	
	@GetMapping("/")
	public String MsgRestController() {
		
		return "Hi, How Are You ? ";
	}

}
