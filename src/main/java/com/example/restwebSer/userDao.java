package com.example.restwebSer;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.Min;
import javax.validation.constraints.Past;
import javax.validation.constraints.Size;
@Entity
public class userDao {
	@Id
	@GeneratedValue
private Integer id;
@Size(min=4, message="name should have atleasr 4 characters")
private String name;
@Past
private Date date;
public userDao(Integer id, String name, Date date) {
	super();
	this.id = id;
	this.name = name;
	this.date = date;
}
public Integer getId() {
	return id;
}
public void setId(Integer id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public Date getDate() {
	return date;
}
public void setDate(Date date) {
	this.date = date;
}

}
