package com.abrar.openapi.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.abrar.openapi.entity.UserMaster;

@Repository
public interface UserRepository extends CrudRepository<UserMaster, Long>{

	
}
