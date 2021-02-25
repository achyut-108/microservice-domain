package com.ihs.gsg.service.impl;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;
import org.springframework.web.multipart.MultipartFile;

import com.ihs.gsg.entity.AssignmentEntity;
import com.ihs.gsg.repo.AssignmentRepository;


/**
 * @author saurabh.shyam
 * @since Feb 25, 2021 5:49 PM
 */
@Service
public class FileStorageService {

    @Autowired
    private AssignmentRepository fileDBRepository;

    public AssignmentEntity store(MultipartFile file,String user) throws IOException {
        String fileName = StringUtils.cleanPath(file.getOriginalFilename());
        AssignmentEntity assignmentEntity = new AssignmentEntity();
       // (fileName, file.getContentType(), file.getBytes(),Long.parseLong(user))
      //  assignmentEntity.

        return fileDBRepository.save(assignmentEntity);
    }

    public AssignmentEntity getFile(String id,String user) {
        return fileDBRepository.findbyIdAndUser(id,user);
    }

    public List<AssignmentEntity> getAllFiles(String user) {
        List<AssignmentEntity> allfiles=new ArrayList<>();
         fileDBRepository.findAllByUserId(user).forEach(allfiles::add);
        return allfiles;
    }
}
