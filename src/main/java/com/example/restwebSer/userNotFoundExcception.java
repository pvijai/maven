package com.example.restwebSer;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;
@ResponseStatus(HttpStatus.NOT_FOUND)
public class userNotFoundExcception extends RuntimeException {

	public userNotFoundExcception(String message) {
		super(message);
		// TODO Auto-generated constructor stub
	}

}
