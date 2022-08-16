package com.ihs.gsg.common.util;

import java.util.Collections;
import java.util.Objects;

import org.springframework.util.CollectionUtils;

import com.ihs.gsg.common.CommonServiceResponse;

public class ServiceUtil {

	public static void setSuccess(CommonServiceResponse serviceResponse) {
		if(Objects.nonNull(serviceResponse)) {
			//serviceResponse.setMessage("SUCCESS");
			serviceResponse.setSuccess(true);
			serviceResponse.setValidationErrors(Collections.EMPTY_LIST);
		}
	}
	
	public static void setFailure(CommonServiceResponse serviceResponse) {
		if(Objects.nonNull(serviceResponse)) {
			//serviceResponse.setMessage("FAILURE");
			serviceResponse.setSuccess(false);
			serviceResponse.setValidationErrors(Collections.EMPTY_LIST);
		}
	}
}
