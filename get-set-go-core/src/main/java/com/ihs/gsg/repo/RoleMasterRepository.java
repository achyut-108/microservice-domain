package com.ihs.gsg.repo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.ihs.gsg.entity.RoleMasterEntity;

@Repository
public interface RoleMasterRepository extends CrudRepository<RoleMasterEntity, Integer>{
	
}
