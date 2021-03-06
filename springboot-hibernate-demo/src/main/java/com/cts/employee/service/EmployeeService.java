package com.cts.employee.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.cts.employee.entity.Employee;


public interface EmployeeService {
	public List<Employee> findAll();
	
	public Employee findById(int theId);
		
	public void save(Employee theEmployee);
		
	public void deleteById(int theId);
	public List<Employee> getEmployeeByDesignation(String designation);
}
