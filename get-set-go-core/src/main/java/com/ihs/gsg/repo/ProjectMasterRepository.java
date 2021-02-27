package com.ihs.gsg.repo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.ihs.gsg.entity.ProjectMasterEntity;

@Repository
public interface ProjectMasterRepository extends CrudRepository<ProjectMasterEntity, Integer>{
	
}
