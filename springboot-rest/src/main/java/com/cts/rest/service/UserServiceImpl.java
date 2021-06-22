package com.cts.rest.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cts.rest.entity.User;
import com.cts.rest.repository.UserRepository;
@Service
public class UserServiceImpl implements UserService{
	
	private UserRepository userRepository;

	public UserServiceImpl(@Autowired UserRepository userRepository) {
		super();
		this.userRepository = userRepository;
	}

	@Override
	public List<User> findAllUsers() {
		return userRepository.findAll();
	}
	
	/*
	 * public Optional<User> findUserById(long id) { return
	 * userRepository.findById(id); }
	 */
	
	
	@Override
	public User saveUser(User user) {
		return userRepository.save(user);
	}


	

}
