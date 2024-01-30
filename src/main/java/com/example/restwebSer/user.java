package com.example.restwebSer;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Component;

import java.util.Iterator;
@Component
public class user {
private static List <userDao> list=new ArrayList<>();
private Integer count=13;
static {
	list.add(new userDao(1,"priyanka",new Date()));
	list.add(new userDao(2,"preethi",new Date()));
	list.add(new userDao(3,"kala",new Date()));

}
public List<userDao> find()
{
	return list;
}
public  userDao save(userDao userdao)
{ if(userdao.getId()==null)
	{
	    userdao.setId(++count);
	}
else
	{
	    list.add(userdao);
	}
	return userdao;
}
public userDao findone(int id)
{
	for(userDao userDao:list)
	{
		if(userDao.getId()==id)
			return userDao;
	}
	return null;
}
public  userDao save1(userDao userdao) {
	{
		userdao.setId(++count);
	
		list.add(userdao);
		return userdao;
	}
}
public  userDao delete(int id) {
	Iterator <userDao> iterator=list.iterator();
		while(iterator.hasNext())
		{
			userDao users=iterator.next();
			//userDao u1=iterator.next();
	    if(id==users.getId()) {
	iterator.remove();
	    return users;
	    }
		}
		return null;
	
	}
}
