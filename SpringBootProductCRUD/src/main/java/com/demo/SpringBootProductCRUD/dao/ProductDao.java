package com.demo.SpringBootProductCRUD.dao;


import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.demo.SpringBootProductCRUD.beans.Product;

@Repository
public interface ProductDao extends JpaRepository<Product,Integer>{
	
	@Query(value="select * from product  where price between :lpr and :hpr",nativeQuery = true)
	//@Query(value="select p from Product p where price between :lpr and :hpr")
	List<Product> getByPrice(int lpr, int hpr);

}
