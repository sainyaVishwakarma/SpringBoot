package com.demo.SpringBootRestProductCRUD.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.SpringBootRestProductCRUD.dao.ProductDao;
import com.demo.SpringBootRestProductCRUD.model.Product;
@Service
public class ProductServiceImpl implements ProductService{
	
	@Autowired
	private ProductDao productDao;

	@Override
	public List<Product> getAllProducts() {
		// TODO Auto-generated method stub
		 List<Product> plist=productDao.findAll();
		 return plist;
	}

	@Override
	public void addProduct(Product p) {
		// TODO Auto-generated method stub
		System.out.println(p);
	  productDao.save(p);
	}

	@Override
	public void deleteProduct(int pid) {
		// TODO Auto-generated method stub
		productDao.deleteById(pid);
	}

	@Override
	public Product getById(int pid) {
		// TODO Auto-generated method stub
		Optional<Product> op=productDao.findById(pid);
		if(op.isPresent()) {
			return op.get();
		}
		return null;
	}

	@Override
	public void updateProduct( Product p) {
		// TODO Auto-generated method stub
		Optional<Product> op=productDao.findById(p.getPid());
		if(op.isPresent()) {
			Product p1= op.get();
			p1.setPname(p.getPname());
			p1.setQty(p.getQty());
			p1.setPrice(p.getPrice());
			productDao.save(p);
		}
		
	}
	
	
}
