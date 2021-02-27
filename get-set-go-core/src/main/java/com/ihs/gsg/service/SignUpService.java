package com.ihs.gsg.service;

import com.ihs.gsg.domain.signup.NewJoineeSignUpRequest;
import com.ihs.gsg.domain.signup.NewJoineeSignUpResponse;

public interface SignUpService {

	public NewJoineeSignUpResponse signUp(NewJoineeSignUpRequest newJoineeSignUpRequest);
}
