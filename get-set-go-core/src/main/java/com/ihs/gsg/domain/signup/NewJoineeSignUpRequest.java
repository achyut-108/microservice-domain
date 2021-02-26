package com.ihs.gsg.domain.signup;

import java.io.Serializable;
import java.util.Date;

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
	private Long departmentId;//--dpartmentMAster
	private String teamName;
	private String projectId;//---ProjectMaster
	private Date joinningDate;
	private String profileId;//--profileMaster
}
