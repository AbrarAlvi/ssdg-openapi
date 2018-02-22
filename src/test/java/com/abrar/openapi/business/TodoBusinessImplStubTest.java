package com.abrar.openapi.business;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;

import com.abrar.openapi.service.TodoService;

public class TodoBusinessImplStubTest {

	@Test
	public void testRetreiveTodosRelatedToSpring_usingAMock() {
		TodoService toDoServiceMock = mock(TodoService.class);
		when(toDoServiceMock.retrieveTodoServices("Dummy")).thenReturn(Arrays.asList("LearnJava","LearnC"));
		TodoBusinessImpl todoBusinessImpl = new TodoBusinessImpl(toDoServiceMock);
		List<String> filteredList = todoBusinessImpl.retrieveTodoRelatedToSpring("Dummy");
		assertEquals(2, filteredList.size());
		
	}
	
	@Test
	public void testRetreiveTodoEmptyList_usingAMock() {
		TodoService toDoServiceMock = mock(TodoService.class);
		when(toDoServiceMock.retrieveTodoServices("Dummy")).thenReturn(Arrays.asList());
		TodoBusinessImpl todoBusinessImpl = new TodoBusinessImpl(toDoServiceMock);
		List<String> filteredList = todoBusinessImpl.retrieveTodoRelatedToSpring("Dummy");
		assertEquals(0, filteredList.size());
		
	}

}
