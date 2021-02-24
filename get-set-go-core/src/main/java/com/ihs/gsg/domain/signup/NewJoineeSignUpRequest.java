package com.ihs.gsg.domain.signup;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.ihs.gsg.common.CommonServiceRequest;

import lombok.Data;
import lombok.ToString;

@Data
@ToString
@JsonAutoDetect
public class NewJoineeSignUpRequest extends CommonServiceRequest implements Serializable{
	public static final long serialVersionUID = 1L;
	
	private Long joineeId;
	private String name;
	private String role;
	
}
