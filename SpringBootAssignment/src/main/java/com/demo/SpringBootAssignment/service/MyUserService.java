package com.demo.SpringBootAssignment.service;

import java.util.List;

import com.demo.SpringBootAssignment.model.MyUser;

public interface MyUserService {

	List<MyUser> getAllUser();

	void addNewUser(MyUser u);

	List<MyUser> getByCity(String city);

}
