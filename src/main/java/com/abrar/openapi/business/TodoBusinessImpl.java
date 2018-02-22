package com.abrar.openapi.business;
import java.util.List;

import com.abrar.openapi.service.TodoService;

public class TodoBusinessImpl {

	
	private TodoService todoService;
	
	public TodoBusinessImpl(TodoService todoService) {
		this.todoService = todoService;
	}
	
	public List<String> retrieveTodoRelatedToSpring(String user){
		  List<String> filteredList = todoService.retrieveTodoServices(user);
		return filteredList;
		
	}

}
