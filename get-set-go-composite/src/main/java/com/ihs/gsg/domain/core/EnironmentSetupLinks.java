package com.ihs.gsg.domain.core;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author saurabh.shyam
 * @since Feb 24, 2021 4:42 PM
 */

@Data
@NoArgsConstructor
@AllArgsConstructor 
public class EnironmentSetupLinks implements Serializable{

	public static final Long serialVersionUID = 1L; 
	
	private long linkId;
	private String keyName;
	private String keyValue;
}
