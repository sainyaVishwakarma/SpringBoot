package com.demo.SpringBootRestProductCRUD.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.demo.SpringBootRestProductCRUD.model.Product;
import com.demo.SpringBootRestProductCRUD.service.ProductService;


@RestController
public class ProductController {
	
	@Autowired
	private ProductService productService;
	
	@GetMapping("/products")
	public List<Product> getAllProducts() {
		List<Product> plist=productService.getAllProducts();
		return plist;
	}

	@GetMapping("/products/{pid}")
	public ResponseEntity<Product> getById(@PathVariable int pid) {
	Product p=productService.getById(pid);
	if(p!=null) {
		return ResponseEntity.ok(p);
	}else {
		return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
	}
		
	}
	@PostMapping("/products/{pid}")
	public ResponseEntity<String> insertProduct( @RequestBody Product p) {
		productService.addProduct(p);
		return ResponseEntity.ok("Added succesfully");
		}
	@DeleteMapping("/products/{pid}")
	public ResponseEntity<String> deleteById(@PathVariable int pid) {
		productService.deleteProduct(pid);
		return ResponseEntity.ok("deleted succesfully");
	}
	
	
	
	@PutMapping("/products/{pid}")
	public ResponseEntity<String> updateProduct( @RequestBody Product p) {
		productService.updateProduct(p);
		return ResponseEntity.ok("modified succesfully");
			
		}
		
	}

