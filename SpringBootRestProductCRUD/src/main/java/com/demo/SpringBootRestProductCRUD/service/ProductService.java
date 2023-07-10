package com.demo.SpringBootRestProductCRUD.service;

import java.util.List;

import com.demo.SpringBootRestProductCRUD.model.Product;

public interface ProductService {

	List<Product> getAllProducts();

	void addProduct( Product p);

	void deleteProduct(int pid);

	Product getById(int pid);

	void updateProduct( Product p);

	

}
