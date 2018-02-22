package com.abrar.openapi.resources;

import java.sql.Date;
import java.sql.Timestamp;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.abrar.openapi.entity.UserMaster;
import com.abrar.openapi.repository.UserRepository;
import com.abrar.openapi.service.TodoService;

import io.swagger.annotations.Api;
@Service
@Api(tags="User Operations")
@RestController
@RequestMapping("/rest/users")
public class UserResource {
	
	@Autowired
	TodoService todoService;
	
	
	@GetMapping("/all")
	List<UserMaster> getAllUserList(){
		return todoService.retrieveTodoServices();
		
	}
	
	 @RequestMapping(value={"/id/{user_id}/"},method = RequestMethod.GET)
	public UserMaster findByUserId(@PathVariable int user_id ){
		return todoService.findUserById(user_id);
	}
	
}
