package com.abrar.openapi.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.abrar.openapi.entity.UserMaster;
import com.abrar.openapi.service.TodoService;

import io.swagger.annotations.Api;

@Api(tags="Sample Resource to say hi")
@RestController
@RequestMapping("/rest/hello")
public class HelloResource {
	
	@Autowired
	TodoService todoService;
	
	@GetMapping("/all")
	public String hello(){		
		return "Hello";
	}
	
	@GetMapping("/secured/all")
	public String securedHello(){		
		return "Secured Hello";
	}
	
	
	@GetMapping("/userlist/")
	public List<UserMaster> userList(){
		System.out.println("hello userList ");
		return todoService.retrieveTodoServices();
	}
	

}