package com.ihs.gsg.domain.assignment;

import java.io.Serializable;
import java.util.List;

import com.ihs.gsg.common.CommonServiceResponse;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper=false)
public class AssignmentDownloadResponse extends CommonServiceResponse implements Serializable {

	public static final long serialVersionUID = 1L;
	
	private List<AssignmentDetails> assignmentDetails;
}
