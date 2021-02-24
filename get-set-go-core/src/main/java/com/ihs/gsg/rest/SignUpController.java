package com.ihs.gsg.rest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ihs.gsg.domain.signup.NewJoineeSignUpRequest;
import com.ihs.gsg.domain.signup.NewJoineeSignUpResponse;

@RestController
@RequestMapping("gsg/new-joinee")
public class SignUpController {

	private static final Logger log = LoggerFactory.getLogger(SignUpController.class);

	@PostMapping(value="/sign-up/post",produces="application/json")
	public NewJoineeSignUpResponse signUp(@RequestBody NewJoineeSignUpRequest newJoineeSignUpRequest) {
		log.info("request : {}", newJoineeSignUpRequest.toString());
		return new NewJoineeSignUpResponse();			
	}
	
	@PostMapping(value="/ab2/post",produces="application/json")
	public NewJoineeSignUpResponse signUp2() {
		//log.info("request : {}", newJoineeSignUpRequest.toString());
		return new NewJoineeSignUpResponse();			
	}
}
