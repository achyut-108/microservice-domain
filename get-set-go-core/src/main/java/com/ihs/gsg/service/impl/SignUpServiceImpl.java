package com.ihs.gsg.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ihs.gsg.domain.signup.NewJoineeSignUpRequest;
import com.ihs.gsg.domain.signup.NewJoineeSignUpResponse;
import com.ihs.gsg.entity.UserMasterEntity;
import com.ihs.gsg.repo.UserMasterRepository;
import com.ihs.gsg.service.SignUpService;

@Service
public class SignUpServiceImpl implements SignUpService{

	@Autowired
	private UserMasterRepository userMasterRepository;
	
	@Override
	public NewJoineeSignUpResponse signUp(NewJoineeSignUpRequest newJoineeSignUpRequest) {
		
		NewJoineeSignUpResponse newJoineeSignUpResponse = new NewJoineeSignUpResponse();
		
		UserMasterEntity userMasterEntity = new UserMasterEntity();
		userMasterEntity.setActive(1);
		userMasterEntity.setId(newJoineeSignUpRequest.getJoineeId());
		
		
		//newJoineeSignUpResponse.set
		
		return newJoineeSignUpResponse;
		
	}
}
