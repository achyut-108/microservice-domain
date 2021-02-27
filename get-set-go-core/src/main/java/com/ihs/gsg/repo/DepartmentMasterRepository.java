package com.ihs.gsg.repo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.ihs.gsg.entity.DepartmentMasterEntity;

@Repository
public interface DepartmentMasterRepository extends CrudRepository<DepartmentMasterEntity, Integer>{
	
}
