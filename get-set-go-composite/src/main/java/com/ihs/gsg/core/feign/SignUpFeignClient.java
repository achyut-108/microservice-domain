package com.ihs.gsg.core.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;

import com.ihs.gsg.domain.core.NewJoineeSignUpRequest;
import com.ihs.gsg.domain.core.NewJoineeSignUpResponse;

@FeignClient(name="get-set-go-core",url="${gsg.core.url}")
public interface SignUpFeignClient {

	@PostMapping("/gsg/new-joinee/sign-up/post")
	public NewJoineeSignUpResponse signUpNewJoinee(NewJoineeSignUpRequest newJoineeSignUpRequest);
	
}
   