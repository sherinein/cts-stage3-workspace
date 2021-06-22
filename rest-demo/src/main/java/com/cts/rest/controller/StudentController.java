package com.cts.rest.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cts.rest.dto.Student;
import com.cts.rest.service.StudentService;
@RestController
@RequestMapping("/api") // http://localhost:8090/api
public class StudentController {
	@Autowired
	private StudentService studentService;
	
	@PostMapping
	public String saveStudent(@RequestBody Student student) {
		
		return "student added successfully";
	}

}
