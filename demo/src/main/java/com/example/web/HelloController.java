package com.example.web;

import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
	public String sayHello() {
		return "hello";
	}
}