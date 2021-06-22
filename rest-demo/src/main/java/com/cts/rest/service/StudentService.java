package com.cts.rest.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cts.rest.dao.StudentDao;
@Service
public class StudentService {
	@Autowired
	private StudentDao studentDao;
	
}
