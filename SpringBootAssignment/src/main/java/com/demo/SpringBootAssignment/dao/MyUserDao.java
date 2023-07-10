package com.demo.SpringBootAssignment.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.demo.SpringBootAssignment.model.MyUser;

@Repository
public interface MyUserDao extends JpaRepository<MyUser,Integer>{
	
	@Query(value="select * from registereduser  where city = :city",nativeQuery = true)
	List<MyUser> getByCity(String city);

}
