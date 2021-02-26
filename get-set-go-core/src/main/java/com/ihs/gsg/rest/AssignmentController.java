package com.ihs.gsg.rest;

import java.math.BigInteger;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.ihs.gsg.domain.assignment.ResponseFile;
import com.ihs.gsg.entity.AssignmentEntity;
import com.ihs.gsg.service.impl.FileStorageService;

/**
 * @author saurabh.shyam
 * @since Feb 25, 2021 5:58 PM
 */
@RestController
@RequestMapping(("gsg/file"))
public class FileController {

    @Autowired
    private FileStorageService storageService;

    @PostMapping("/upload/{user}")
    public ResponseEntity<String> uploadFile(@RequestParam("file") MultipartFile file,@PathVariable String user) {
        String message = "";
        try {
            storageService.store(file,user);

            message = "Uploaded the file successfully: " + file.getOriginalFilename();
            return ResponseEntity.status(HttpStatus.OK).body(message);
        } catch (Exception e) {
            message = "Could not upload the file: " + file.getOriginalFilename() + "!";
            return ResponseEntity.status(HttpStatus.EXPECTATION_FAILED).body(message);
        }
    }

    @GetMapping("/files/{user}")
    public ResponseEntity<List<ResponseFile>> getListFiles(@PathVariable Long user) {
        List<ResponseFile> files = storageService.getAllFiles(user).stream().map(dbFile -> {
            String fileDownloadUri = ServletUriComponentsBuilder
                    .fromCurrentContextPath()
                    .path("/files/")
                    .path(String.valueOf(dbFile.getId()))
                    .toUriString();

            return new ResponseFile(
                    dbFile.getAssignmentName(),
                    fileDownloadUri,
                    dbFile.getFileType(),
                    dbFile.getData().length);
        }).collect(Collectors.toList());

        return ResponseEntity.status(HttpStatus.OK).body(files);
    }

    @GetMapping("/files/{id}/{user}")
    public ResponseEntity<byte[]> getFile(@PathVariable BigInteger id,@PathVariable Long user ) {
        AssignmentEntity fileDB = storageService.getFile(id,user);

        return ResponseEntity.ok()
                .header(HttpHeaders.CONTENT_DISPOSITION, "attachment; filename=\"" + fileDB.getAssignmentName() + "\"")
                .body(fileDB.getData());
    }
}
