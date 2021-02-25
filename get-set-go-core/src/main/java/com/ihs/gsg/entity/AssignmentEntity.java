package com.ihs.gsg.entity;

import java.math.BigInteger;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author saurabh.shyam
 * @since Feb 25, 2021 5:43 PM
 */
@Entity
@Table(name = "assignment_trans")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class AssignmentEntity {
    
	@Id
	@Column(name="id")
	@GeneratedValue(strategy = GenerationType.AUTO)
    private BigInteger id;
	@Column(name="assignmentName")
    private String assignmentName;
	@Column(name="assignmentType")
    private String assignmentType;
	@Column(name="fileType")
    private String fileType;
	@Column(name="trainerId")
    private Long trainerId;
	@Column(name="traineeId")
    private Long traineeId;

    @Lob
    private byte[] data;
    
}