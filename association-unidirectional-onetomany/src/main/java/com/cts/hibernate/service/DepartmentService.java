package com.cts.hibernate.service;

import java.util.List;

import com.cts.hibernate.entity.Department;

public interface DepartmentService {
	public List<Department> findAll();

	public Department findById(int theId);

	public void save(Department department);

	public void deleteById(int theId);
}
