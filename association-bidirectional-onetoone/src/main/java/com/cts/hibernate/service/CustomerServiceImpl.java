package com.cts.hibernate.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cts.hibernate.entity.Customer;
import com.cts.hibernate.repository.CustomerRepository;
@Service
@Transactional
public class CustomerServiceImpl implements CustomerService {

	private CustomerRepository customerRepository;
	@Autowired
	public CustomerServiceImpl(CustomerRepository customerRepository) {
		super();
		this.customerRepository = customerRepository;
	}
	@Override
	public List<Customer> findAll() {
			return customerRepository.findAll();
	}
	@Override
	public Customer findById(int theId) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public void save(Customer customer) {
		customerRepository.save(customer);
		
	}
	@Override
	public void deleteById(int theId) {
		// TODO Auto-generated method stub
		
	}
	
	
	
}
