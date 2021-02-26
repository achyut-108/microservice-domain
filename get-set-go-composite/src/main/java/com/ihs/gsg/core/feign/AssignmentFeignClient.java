package com.ihs.gsg.core.feign;

import java.math.BigInteger;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import com.ihs.gsg.domain.core.AssignmentDownloadResponse;
import com.ihs.gsg.domain.core.AssignmentUploadResponse;

import feign.Headers;

@FeignClient(name="get-set-go-core",url="${gsg.core.url}")
public interface AssignmentFeignClient {

	@PostMapping("/gsg/file/upload/{userId}/{assignmentType}")
	@Headers("Content-Type: multipart/form-data")
	public AssignmentUploadResponse uploadFile(@RequestParam("file") MultipartFile file,@PathVariable("userId") Long userId,@PathVariable("assignmentType") String assignmentType);
	
	@GetMapping("/gsg/file/files/get/{assignmentId}/{userId}")
	public ResponseEntity<byte[]> getAssignment(@PathVariable BigInteger assignmentId, @PathVariable Long userId);

	@GetMapping("/gsg/file/files/get/{userId}")
	public AssignmentDownloadResponse getAllAssignment(@PathVariable Long userId);
}
   