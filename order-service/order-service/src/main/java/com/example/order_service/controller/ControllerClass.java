package com.example.order_service.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/order")
public class ControllerClass {
	
	@GetMapping("/welcome")
	public String printWelcome() {
		return "Hey! Welcome to the order Service";
	}
	
}
