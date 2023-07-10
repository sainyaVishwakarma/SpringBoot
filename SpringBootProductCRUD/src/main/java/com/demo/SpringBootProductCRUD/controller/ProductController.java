package com.demo.SpringBootProductCRUD.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import com.demo.SpringBootProductCRUD.beans.Product;
import com.demo.SpringBootProductCRUD.service.ProductService;

@Controller
public class ProductController {
	
	@Autowired
	private ProductService productService;
	
	@GetMapping("/viewproducts")
	public ModelAndView getAllProducts() {
		List<Product> plist=productService.getAllProducts();
		return new ModelAndView("displayproducts","plist",plist);
	}
	
	@GetMapping("/addnewproduct")
	public String displayAddForm(Model model) {
		Product p=new Product();
		model.addAttribute("product",p);
		return "addproduct";
	}
	
	@PostMapping("/insertproduct")
	public ModelAndView insertProduct(@Valid @ModelAttribute("product") Product p,BindingResult result) {
		if(result.hasErrors()) 
			return new ModelAndView("addproduct","",null);
		
			Product p1=productService.addProduct(p);
			return new ModelAndView("redirect:/viewproducts");
		}
	@GetMapping("/delete/{pid}")
	public ModelAndView deleteById(@PathVariable int pid) {
		productService.deleteProduct(pid);
		return new ModelAndView("redirect:/viewproducts");
	}
	
	@GetMapping("/edit/{pid}")
	public ModelAndView editProduct(@PathVariable int pid) {
		Product p=productService.getById(pid);
		if(p!=null) {
			return new ModelAndView("editproduct","product",p);
		}
		return new ModelAndView("redirect:/viewproducts");
	}
	
	@PostMapping("/updateproduct")
	public ModelAndView updateProduct(@Valid @ModelAttribute Product p,BindingResult result) {
		if(result.hasErrors()) 
			return new ModelAndView("editproduct","",null);
		
		productService.updateProduct(p);
		return new ModelAndView("redirect:/viewproducts");
			
		}
	@GetMapping("/getbyprice/{lpr}/{hpr}")
	public ModelAndView getByPrice(@PathVariable int lpr,@PathVariable int hpr) {
		List<Product> plist=productService.getByPrice(lpr,hpr);
		return new ModelAndView("displaybyprice","plist",plist);
		
	}
		
	}

