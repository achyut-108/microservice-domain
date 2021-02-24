package com.ihs.gsg.domain.signup;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.ihs.gsg.common.CommonServiceResponse;

import lombok.Data;

@Data
@JsonAutoDetect
public class NewJoineeSignUpResponse extends CommonServiceResponse implements Serializable {
	public static final long serialVersionUID = 1L;
}
