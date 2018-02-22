package com.abrar.openapi.service;

import java.util.List;



import com.abrar.openapi.entity.UserMaster;


public interface TodoService {

	public List<UserMaster> retrieveTodoServices();
	public UserMaster findUserById(int user_id);
	
}
