package com.cts.rest.controller;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cts.rest.entity.User;
import com.cts.rest.model.ui.request.UserRequest;
import com.cts.rest.model.ui.response.UserResponse;
import com.cts.rest.service.UserServiceImpl;

@RestController
@RequestMapping("/v1/api/users")
public class UserController {
	 
		private UserServiceImpl userService;
	
		private ModelMapper modelMapper;
		
		@Autowired 	
	 	public UserController(UserServiceImpl userService, ModelMapper modelMapper) {
			super();
			this.userService = userService;
			this.modelMapper = modelMapper;
		}

	
	 	@PostMapping
		public ResponseEntity<UserResponse> saveUser(@Validated @RequestBody UserRequest userRequest) {
	 		// convert DTO to entity
			User userEntity = modelMapper.map(userRequest, User.class);
		
			User user =userService.saveUser(userEntity);
			// convert entity to DTO
			UserResponse userResponse = modelMapper.map(user, UserResponse.class);
			return new ResponseEntity<UserResponse>(userResponse, HttpStatus.CREATED);
		}

		@GetMapping
		public List<UserResponse> findAllUsers() {
			return userService.findAllUsers().stream().map(user -> modelMapper.map(user, UserResponse.class))
					.collect(Collectors.toList());
		}
		
	/*
	 * @GetMapping("/{id}") public ResponseEntity<User>
	 * findUserById(@PathVariable(value = "id") long id) { Optional<User> user =
	 * userService.findUserById(id);
	 * 
	 * if(user.isPresent()) { return ResponseEntity.ok().body(user.get()); } else {
	 * return ResponseEntity.notFound().build(); } }
	 */
	 	
}
