package com.abrar.openapi.resources;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@RequestMapping("/rs")
@RestController
@Api(value="Hello API",description="API to say Hello", tags={"Hello"})
public class HelloResource {
	
	@ApiOperation(value="Simple Hello", tags={"Hello"})
	@GetMapping("/hello")
	public String hello(){		
		return "Hello";
	}
	
	@ApiOperation(value="Secured Hello",tags={"Hello"})
	@GetMapping("/secured/hello")
	public String securedHello(){		
		return "Secured Hello";
	}
	

}