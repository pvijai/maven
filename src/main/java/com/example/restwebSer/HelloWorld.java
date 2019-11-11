package com.example.restwebSer;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorld {
@GetMapping(path="/hello")
	public String hello()
	{
		return "hi peeps";
	}
@GetMapping(path="/helloBean")
public helloBean Helloworld(){
	
	return new helloBean("callling from hellobean ");
}
@GetMapping(path="/pathVariable/{name}")
public String pathVariable(@PathVariable String name)
{
	return "path variable" +name;
}
}
