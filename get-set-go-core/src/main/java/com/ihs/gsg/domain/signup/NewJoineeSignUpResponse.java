package com.ihs.gsg.domain.signup;

import java.io.Serializable;
import java.math.BigInteger;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.ihs.gsg.common.CommonServiceResponse;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@JsonAutoDetect
@EqualsAndHashCode(callSuper = false)
public class NewJoineeSignUpResponse extends CommonServiceResponse implements Serializable {
	public static final long serialVersionUID = 1L;
	
	private String userId;
	private BigInteger roleId;
	private String roleName;
}