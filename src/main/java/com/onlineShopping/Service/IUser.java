package com.onlineShopping.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.onlineShopping.Model.User;

@Service
public interface IUser 
{

	public User addUserRegistration(User user_profile);

	public List<User> findAllUser();

	public User updateUser(User user_profile);

	public Object addUser(User user);

	

	
}
