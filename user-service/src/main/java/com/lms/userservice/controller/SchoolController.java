package com.lms.userservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lms.userservice.entity.Schools;
import com.lms.userservice.model.ResponseModel;
import com.lms.userservice.service.SchoolService;

@RestController
@RequestMapping("/api/school/")
public class SchoolController{
	
	@Autowired
	private SchoolService schoolservice;
	
	@PostMapping("/save")
	public ResponseEntity<?> addSchool(@RequestBody Schools schools) {
		
		schoolservice.save(schools);
		ResponseModel responseModel = new ResponseModel(true, "School Created Suessfully", null);
		return ResponseEntity.accepted().body(responseModel);
	}
}