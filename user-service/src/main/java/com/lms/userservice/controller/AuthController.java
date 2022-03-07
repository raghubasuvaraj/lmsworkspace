package com.lms.userservice.controller;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;

import javax.servlet.http.HttpServletRequest;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.DisabledException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.lms.userservice.entity.AuthRequest;
import com.lms.userservice.entity.TokenJwt;
import com.lms.userservice.model.ResponseMessage;
import com.lms.userservice.model.ResponseModel;
import com.lms.userservice.serviceImpl.UserService;
import com.lms.userservice.util.JwtUtil;

import io.jsonwebtoken.MalformedJwtException;

@RestController
@RequestMapping("/api/user")
public class AuthController {

	@Autowired
	private JwtUtil jwtUtil;
	@Autowired
	private AuthenticationManager authenticationManager;

	@Autowired
	private UserService service;

	@PostMapping("/authenticate")
	public ResponseEntity<?> generateToken(@RequestBody AuthRequest authRequest, HttpServletRequest request)
			throws Exception {
		ResponseMessage msg = new ResponseMessage();
		try {
			authenticationManager.authenticate(
					new UsernamePasswordAuthenticationToken(authRequest.getUsername(), authRequest.getPassword()));
		} catch (DisabledException e) {
			throw new DisabledException(e.getMessage());
		} catch (BadCredentialsException e) {
			throw new BadCredentialsException(e.getMessage());
		} catch (Exception e) {
			throw new Exception(e.getMessage());
		}
		TokenJwt qwtoken = new TokenJwt();
		String username = authRequest.getUsername();
		String token = jwtUtil.generateToken(authRequest.getUsername());
	
		qwtoken.setToken(token);
		qwtoken.setUsername(username);
		ResponseModel responseModel = new ResponseModel(true, "Token", qwtoken);
		return ResponseEntity.accepted().body(responseModel);

	}

	

}
