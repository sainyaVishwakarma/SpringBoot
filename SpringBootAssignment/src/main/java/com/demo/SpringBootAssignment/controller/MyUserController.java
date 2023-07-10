package com.demo.SpringBootAssignment.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import com.demo.SpringBootAssignment.model.MyUser;
import com.demo.SpringBootAssignment.service.MyUserService;



@Controller
public class MyUserController {
	
	@Autowired
	MyUserService myUserService;
	
	@GetMapping("/viewusers")
	public ModelAndView getAllUser(){
		List<MyUser> ulist=myUserService.getAllUser();
		return new ModelAndView("displayusers","ulist",ulist);
	}
	
	@GetMapping("/addnewuser")
	public String addUserForm(Model model){
		MyUser u=new MyUser();
		model.addAttribute("user", u);
		return "adduser";
	}
	

	@PostMapping("/insertuser")
	public ModelAndView addNewUser(@ModelAttribute("user") MyUser u,BindingResult result){
		if(result.hasErrors()) {
			return new ModelAndView("adduser","",null);
		}
		myUserService.addNewUser(u);
		return new ModelAndView("redirect:/viewusers");
	}
	
	@GetMapping("/getbycity/{city}")
	public ModelAndView getByPrice(@PathVariable String city) {
		List<MyUser> ulist=myUserService.getByCity(city);
		return new ModelAndView("displaybycity","ulist",ulist);
		
	}
	
	@GetMapping("/logout")
	public String logout(){
		return "login";
	}
	
}
