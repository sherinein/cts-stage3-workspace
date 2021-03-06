package com.cts.employee.service;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cts.employee.entity.Employee;
import com.cts.employee.respository.EmployeeDao;
import com.cts.employee.respository.EmployeeRepository;
@Transactional
@Service
public class EmployeeServiceImpl implements EmployeeService {
	private final Logger LOGGER=LoggerFactory.getLogger(EmployeeServiceImpl.class);
	@Autowired
	private EmployeeRepository employeeRepository;
	@Autowired
	private EmployeeDao employeeDao;
	@Override
	public List<Employee> findAll() {
		return employeeRepository.findAll();
	}
	
	@Override
	public Employee findById(int theId) {
		Optional<Employee> result=employeeRepository.findById(theId);
		Employee emp=null;
		if(result.isPresent()) {
			emp = result.get();
		}
		return emp;
	}
	
	@Override
	public void save(Employee theEmployee) {
		employeeRepository.save(theEmployee);
		LOGGER.info("Employee Record saved");
	}

	@Override
	public void deleteById(int theId) {
		// Spring Data JPA
		//employeeRepository.deleteById(theId); 
		// Hiberante 
		employeeDao.deleteById(theId);
	}

	@Override
	public List<Employee> getEmployeeByDesignation(String designation) {
		
		return employeeDao.getEmployeeByDesignation(designation);
	}
	
	
	

}
