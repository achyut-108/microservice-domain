package com.ihs.gsg.rest;

import java.math.BigInteger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.ihs.gsg.core.feign.AssignmentFeignClient;
import com.ihs.gsg.domain.core.AssignmentDownloadResponse;
import com.ihs.gsg.domain.core.AssignmentUploadResponse;

/**
 * @author saurabh.shyam
 * @since Feb 25, 2021 5:58 PM
 */
@RestController
@RequestMapping(("gsg/file"))
public class AssignmentController {

	@Autowired
	private AssignmentFeignClient assignmentFeignClient;

	@PostMapping("/upload/{userId}/{assignmentType}")
	public AssignmentUploadResponse uploadFile(@RequestParam("file") MultipartFile file, @PathVariable Long userId,
			@PathVariable String assignmentType) {
		String message = "";
		AssignmentUploadResponse assignmentUploadResponse = new AssignmentUploadResponse();
		try {
			assignmentFeignClient.uploadFile(file, userId, assignmentType);

			message = "Uploaded the file successfully: " + file.getOriginalFilename();
			assignmentUploadResponse.setMessage(message);
			return assignmentUploadResponse;
			// return ResponseEntity.status(HttpStatus.OK).body(message);
		} catch (Exception e) {
			message = "Could not upload the file: " + file.getOriginalFilename() + "!";
			assignmentUploadResponse.setMessage(message);
			return assignmentUploadResponse;
			// return ResponseEntity.status(HttpStatus.EXPECTATION_FAILED).body(message);
		}
	}

	@GetMapping("/files/get/{userId}")
	public AssignmentDownloadResponse getAllAssignment(@PathVariable Long userId) {

		return assignmentFeignClient.getAllAssignment(userId);
	}

	@GetMapping("/files/get/{assignmentId}/{userId}")
	public ResponseEntity<byte[]> getFile(@PathVariable BigInteger assignmentId, @PathVariable Long userId) {

		return assignmentFeignClient.getAssignment(assignmentId, userId);
	}
}