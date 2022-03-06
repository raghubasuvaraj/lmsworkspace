package com.lms.examservice.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;



@RestController
public class HelloController {

	@Autowired
	private HttpServletRequest request;

	@GetMapping("/examtest")
	public String helloWorld() throws Exception {

		return "Hello EXAM from server with port : "+ request.getServerPort()
		;
	}
	

}
