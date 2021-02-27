package com.ihs.gsg.repo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.ihs.gsg.entity.ProfileMasterEntity;

@Repository
public interface ProfileMasterRepository extends CrudRepository<ProfileMasterEntity, Integer>{
	
}
