package com.cts.hibernate.service;

import java.util.List;

import com.cts.hibernate.entity.Student;



public interface StudentService {
	public List<Student> findAll();

	public Student findById(int theId);

	public void save(Student student);

	public void deleteById(int theId);
}
