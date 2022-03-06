package com.lms.userservice.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;



@RestController
public class HelloController {

	@Autowired
	private HttpServletRequest request;

	@GetMapping("/hello")
	public String helloWorld() throws Exception {

		return "Hello World1 from server with port : "+ request.getServerPort()
		;
	}
	

}
