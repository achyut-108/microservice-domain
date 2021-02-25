package com.ihs.gsg.repo;

import java.math.BigInteger;
import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.ihs.gsg.entity.AssignmentEntity;

/**
 * @author saurabh.shyam
 * @since Feb 25, 2021 5:48 PM
 */
@Repository
public interface AssignmentRepository extends CrudRepository<AssignmentEntity, BigInteger> {

     AssignmentEntity findbyIdAndUser(String id,String user);
     List<AssignmentEntity> findAllByUserId(String user);

}
