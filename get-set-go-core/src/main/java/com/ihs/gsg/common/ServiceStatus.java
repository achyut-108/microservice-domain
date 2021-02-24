package com.ihs.gsg.common;

import java.io.Serializable;

import lombok.Data;

@Data
public class ServiceStatus extends ApiValidationBase implements Serializable {

	public static final long serialVersionUID = 1L;
	private Boolean success;
	private String message;
}
