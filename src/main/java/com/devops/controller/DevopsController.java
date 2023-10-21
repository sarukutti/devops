package com.devops.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DevopsController {
	
	@GetMapping("/getvalue")
	public String getValue() {
		return "Sastha Roopan";
	}
	

}
