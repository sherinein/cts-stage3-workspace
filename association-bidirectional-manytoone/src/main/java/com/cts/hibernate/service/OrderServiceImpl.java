package com.cts.hibernate.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cts.hibernate.entity.Order;
import com.cts.hibernate.repository.OrderItemRepository;
import com.cts.hibernate.repository.OrderRepository;
@Service
@Transactional
public class OrderServiceImpl implements OrderService{
	@Autowired
	private OrderRepository orderRepository;
	@Override
	public List<Order> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Order findById(int theId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void save(Order order) {
		orderRepository.save(order);
		
	}

	@Override
	public void deleteById(int theId) {
		// TODO Auto-generated method stub
		
	}

}
