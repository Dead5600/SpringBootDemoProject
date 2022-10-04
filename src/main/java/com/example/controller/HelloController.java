package com.example.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
	
	@GetMapping(value = "/hello")
	public String greeting(@RequestParam("name")String name) {
		return "Hello\t"+name;
	}
	
	@GetMapping(value = "/add/{a}/{b}")
	public int addition(@PathVariable("a")int a, @PathVariable("b")int b ) {
		return a+b;
	}
}
