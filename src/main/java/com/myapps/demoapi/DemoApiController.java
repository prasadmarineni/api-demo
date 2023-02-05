package com.myapps.demoapi;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@RestController(value = "/app")
public class DemoApiController {

	@GetMapping("/welcome")
	public String getMessage() {
		log.info("Your are in inside /welcome controller");
		return "Hello";
	}
	
}
