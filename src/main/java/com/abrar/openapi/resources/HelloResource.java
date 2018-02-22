package com.abrar.openapi.resources;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.annotations.Api;

@Api(tags="Sample Resource to say hi")
@RestController
@RequestMapping("/rest/hello")
public class HelloResource {
	@GetMapping("/all")
	public String hello(){		
		return "Hello";
	}
	
	@GetMapping("/secured/all")
	public String securedHello(){		
		return "Secured Hello";
	}
	

}