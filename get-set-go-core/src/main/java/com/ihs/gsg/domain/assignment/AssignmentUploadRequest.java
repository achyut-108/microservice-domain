package com.ihs.gsg.domain.assignment;

import java.io.Serializable;

import com.ihs.gsg.common.CommonServiceRequest;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper=false)
public class AssignmentUploadRequest extends CommonServiceRequest implements Serializable{

	public static final long serialVersionUID = 1L;
}
