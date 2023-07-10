package com.demo.SpringBootAssignment.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.SpringBootAssignment.dao.MyUserDao;
import com.demo.SpringBootAssignment.model.MyUser;


@Service
public class MyUserServiceImpl implements MyUserService{
	
	@Autowired
	MyUserDao myUserDao;

	@Override
	public List<MyUser> getAllUser() {
		// TODO Auto-generated method stub
		return myUserDao.findAll();
	}

	@Override
	public void addNewUser(MyUser u) {
		// TODO Auto-generated method stub
		myUserDao.save(u);
	}

	@Override
	public List<MyUser> getByCity(String city) {
		// TODO Auto-generated method stub
		List<MyUser> ulist=myUserDao.getByCity(city);
		System.out.println(ulist);
		return ulist;
	}
}
