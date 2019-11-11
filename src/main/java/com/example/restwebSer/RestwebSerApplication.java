package com.example.restwebSer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
@ComponentScan({"com.example.restwebSer","exception"})
@SpringBootApplication
public class RestwebSerApplication {

	public static void main(String[] args) {
		SpringApplication.run(RestwebSerApplication.class, args);
	}
 
}
