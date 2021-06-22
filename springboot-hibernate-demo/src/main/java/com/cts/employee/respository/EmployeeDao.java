package com.cts.employee.respository;

import java.util.List;

import com.cts.employee.entity.Employee;

public interface EmployeeDao {
	public List<Employee> getEmployeeByDesignation(String designation);
	public void deleteById(int id);
}
