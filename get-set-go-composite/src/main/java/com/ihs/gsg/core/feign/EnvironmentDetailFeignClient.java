package com.ihs.gsg.core.feign;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import com.ihs.gsg.domain.core.EnironmentSetupLinks;

@FeignClient(name="get-set-go-core",url="${gsg.core.url}")
public interface EnvironmentDetailFeignClient {

	@GetMapping("/gsg/env/getSetupDetail/get")
	public List<EnironmentSetupLinks> getEvDetails();
	
}
   