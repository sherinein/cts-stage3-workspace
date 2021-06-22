package com.cts.hibernate.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cts.hibernate.entity.Department;
import com.cts.hibernate.repository.DepartmentRepository;
@Service
@Transactional
public class DepartmentServiceImpl implements DepartmentService{
	@Autowired
	private DepartmentRepository departmentRepository;
	@Override
	public List<Department> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Department findById(int theId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void save(Department department) {
		departmentRepository.save(department);
		
	}

	@Override
	public void deleteById(int theId) {
		// TODO Auto-generated method stub
		
	}

}
