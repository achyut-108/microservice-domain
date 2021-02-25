package com.ihs.gsg.repo;

import java.math.BigInteger;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.ihs.gsg.entity.UserMasterEntity;

@Repository
public interface UserMasterRepository extends CrudRepository<UserMasterEntity, BigInteger>{
	
}
