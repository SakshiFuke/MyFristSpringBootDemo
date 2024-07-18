package com.firstspringdemo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//@Controller
@RestController //(@Controller+@requestBody)
public class HelloController {
	
	@RequestMapping("/Hello")
	public String helloWorld()
	{
		return "Hello Spring Boot";
	}
	
	@RequestMapping("/Bye")
	public String goodByeWorld()
	{
		return"Bye Spring Boot";
	}

}
