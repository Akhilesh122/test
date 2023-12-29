package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.User;
import com.example.demo.repository.UserRepository;

@Service
public class UserService {
	@Autowired
	private UserRepository userRepository;
	//As a user I should be able to see all contacts created
	public List<User> getAllUsers(){
		return userRepository.findAll();
	}
	
	//As a user, I should be able to create a contact with the following data 
    public User createUser(User user) {
    	return userRepository.save(user);
    }
    
   // As a user I should be able to delete a specific contact
	public void deleteById(Long id) {
		userRepository.deleteById(id);
	}
	
}
