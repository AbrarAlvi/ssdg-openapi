package com.abrar.openapi.service;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.abrar.openapi.business.TodoBusinessImpl;
import com.abrar.openapi.entity.UserMaster;
import com.abrar.openapi.repository.UserRepository;

public class TodoServiceStub implements TodoService{

	@Autowired
	UserRepository userRepository;
	
	@Override
	public UserMaster findUserById(int user_id) {
		// TODO Auto-generated method stub
		return userRepository.findOne((long) user_id);
	}

	@Override
	public List<UserMaster> retrieveTodoServices() {
		// TODO Auto-generated method stub
		return null;
	}

	

}
