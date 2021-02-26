package com.ihs.gsg.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ihs.gsg.core.feign.EnvironmentDetailFeignClient;
import com.ihs.gsg.domain.core.EnironmentSetupLinks;

/**
 * @author saurabh.shyam
 * @since Feb 24, 2021 4:58 PM
 */
@RestController
@RequestMapping("/gsg/gsg-composite/env")
public class EnvDetailController {

//	@Autowired
//	EnvDetailServiceImpl envDetailService;
	@Autowired
	private EnvironmentDetailFeignClient environmentDetailFeignClient;

	@GetMapping("/getSetupDetail/get")
	public List<EnironmentSetupLinks> getEnvLinkLinks(){
		return environmentDetailFeignClient.getEvDetails();
	}

}
