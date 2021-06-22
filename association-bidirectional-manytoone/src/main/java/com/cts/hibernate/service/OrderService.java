package com.cts.hibernate.service;

import java.util.List;

import com.cts.hibernate.entity.Order;


public interface OrderService {
	public List<Order> findAll();

	public Order findById(int theId);

	public void save(Order order);

	public void deleteById(int theId);
}
