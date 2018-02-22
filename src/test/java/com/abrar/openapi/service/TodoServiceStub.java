package com.abrar.openapi.service;

import java.util.Arrays;
import java.util.List;

public class TodoServiceStub implements TodoService{

	@Override
	public List<String> retrieveTodoServices(String user) {
		// TODO Auto-generated method stub
		return Arrays.asList("Learn Java","Learn C++","Learn JavaScript");
	}

}
