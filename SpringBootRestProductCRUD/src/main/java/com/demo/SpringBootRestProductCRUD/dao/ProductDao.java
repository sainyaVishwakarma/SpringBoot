package com.demo.SpringBootRestProductCRUD.dao;


import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;

import com.demo.SpringBootRestProductCRUD.model.Product;

@Repository
public interface ProductDao extends JpaRepository<Product,Integer>{

}
