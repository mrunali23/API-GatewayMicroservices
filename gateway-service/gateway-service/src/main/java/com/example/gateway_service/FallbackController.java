package com.example.gateway_service;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FallbackController {
	
	@GetMapping("/orderFallback")
	public String orderFallBack() {
		return "Order service is down ! This is fallback Method!";
	}
	
	@GetMapping("/paymentFallback")
		public String paymentFallBack() {
		return "Payment service is down ! This is fallback Method!";
	}
	

}
