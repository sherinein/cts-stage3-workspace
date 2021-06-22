package com.cts.rest.service;

import java.util.List;
import java.util.Optional;

import com.cts.rest.entity.User;

public interface UserService {
	public List<User> findAllUsers();
	//public Optional<User> findUserById(long id);
	public User saveUser(User user);
}
