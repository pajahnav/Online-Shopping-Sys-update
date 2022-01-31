package com.onlineShopping.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.onlineShopping.Model.User;
import com.onlineShopping.Service.IUser;
@RestController
public class ShoppingController 
{
	@Autowired
	IUser service;
	@PostMapping("/user_profile")

	 @GetMapping("/getProfile") 
	 public ResponseEntity<List <User>> fetchUser() 
	 {
		 System.out.println("alll"); 
		 List<User>products=service.findAllUser(); 
		 return ResponseEntity.ok().body(products); 
	 }
	 
	
	
	@PutMapping ("/updateProfile/{id}") public ResponseEntity<User> updateUser(@PathVariable int id,@RequestBody User user_profile) 
	{
		User u = service.updateUser(user_profile);
		return new ResponseEntity<User>(u,HttpStatus.OK); 
	}
	
	
}
