package com.abrar.openapi.business;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;

import com.abrar.openapi.entity.UserMaster;
import com.abrar.openapi.repository.UserRepository;
import com.abrar.openapi.service.TodoService;

@Controller
public class TodoBusinessImpl implements TodoService{
	
	@Autowired
	UserRepository userRepository;
	
	
	@Override
	public UserMaster findUserById(int user_id) {
		return userRepository.findOne((long)user_id);
	}

	@Override
	public List<UserMaster> retrieveTodoServices() {
		
		return (List<UserMaster>) userRepository.findAll();
	}

	

}
