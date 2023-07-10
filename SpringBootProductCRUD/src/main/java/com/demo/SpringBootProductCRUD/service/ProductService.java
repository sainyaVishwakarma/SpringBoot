package com.demo.SpringBootProductCRUD.service;

import java.util.List;

import javax.validation.Valid;

import com.demo.SpringBootProductCRUD.beans.Product;

public interface ProductService {

	List<Product> getAllProducts();

	Product addProduct(@Valid Product p);

	void deleteProduct(int pid);

	Product getById(int pid);

	void updateProduct(@Valid Product p);

	List<Product> getByPrice(int lpr, int hpr);

	

}
