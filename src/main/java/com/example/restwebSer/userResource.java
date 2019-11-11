package com.example.restwebSer;

import java.net.URI;
import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

@RestController
public class userResource {
@Autowired
	private user user;
@GetMapping(path="/retriveAllUser")
public List<userDao> retriveAllUser() {
	return user.find();
}
@GetMapping(path="/adduser1/{id}")
public userDao retrieve1user(@PathVariable int id) {
	userDao users=user.findone(id);
	if(users==null)
		throw new userNotFoundExcception("id" +id);
	return users;
}
@PostMapping(path="/adduser")
public userDao  adduser(@RequestBody userDao userDao)
{
	return  user.save(userDao);
}
@DeleteMapping(path="/deleteUser/{id}")
public void  deleteuser(@PathVariable int id)
{
	userDao deluser=user.delete(id);
	if(deluser==null)
		throw new userNotFoundExcception("id" +id);
	
}

@PostMapping(path="/adduser1")
public ResponseEntity<Object>  user(@Valid @RequestBody userDao userDao)
{
	userDao saveduser=  user.save1(userDao);
	URI location=ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}")
	.buildAndExpand(saveduser.getId()).toUri();
	return ResponseEntity.created(location).build();
}
 
}
