package com.abrar.openapi.resources;

import java.sql.Date;
import java.sql.Timestamp;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.abrar.openapi.entity.UserMaster;
import com.abrar.openapi.repository.UserRepository;

import io.swagger.annotations.Api;
@Service
@Api(tags="User Operations")
@RestController
@RequestMapping("/rest/users")
public class UserResource {
	
	@Autowired
	UserRepository userRepository;
	
	
	@GetMapping("/all")
	List<UserMaster> getAllUserList(){
		List<UserMaster> userList = (List<UserMaster>)userRepository.findAll();
		for(UserMaster u:userList){
			
			System.out.println(u.getFatherName());
		}
		List sortedUsers = userList.stream().sorted((p1,p2)->p1.getUserName().compareTo(p2.getUserName())).collect(Collectors.toList());
		//userList.forEach(items->System.out.println(items));
		return sortedUsers;
		
		
	}
	
	
	@GetMapping(value={"/all2"})
	public List<UserMaster> t1(){
		
		return (List<UserMaster>) userRepository.findAll();
	}
	
	@GetMapping(value={"/all3"})
	public List<UserMaster> t2(){
		Timestamp d = new Timestamp(new Date(0).getTime());
		UserMaster u = new UserMaster();
		u.setId((long) 200);
		u.setUserId("200");;
		u.setUserName("bikash");
		u.setAddressId("zxczxc");
		u.setDateOfBirth(d);
		userRepository.save(u);
		return (List<UserMaster>) userRepository.findAll();
	}
	
	

}
