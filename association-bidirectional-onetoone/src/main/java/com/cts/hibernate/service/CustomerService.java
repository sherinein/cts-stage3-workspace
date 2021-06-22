package com.cts.hibernate.service;

import java.util.List;

import com.cts.hibernate.entity.Customer;

public interface CustomerService {
	public List<Customer> findAll();

	public Customer findById(int theId);

	public void save(Customer customer);

	public void deleteById(int theId);
}
