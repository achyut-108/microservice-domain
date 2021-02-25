package com.ihs.gsg.domain.core;

import java.io.Serializable;

import com.ihs.gsg.common.CommonServiceRequest;

import lombok.Data;

@Data
public class NewJoineeSignUpRequest extends CommonServiceRequest implements Serializable{
	public static final long serialVersionUID = 1L;
	
	private Long joineeId;
	private String name;
	private String role;
	
}
