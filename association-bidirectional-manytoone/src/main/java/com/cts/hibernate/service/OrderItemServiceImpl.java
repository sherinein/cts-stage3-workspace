package com.cts.hibernate.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cts.hibernate.entity.OrderItem;
import com.cts.hibernate.repository.OrderItemRepository;
@Service
@Transactional
public class OrderItemServiceImpl implements OrderItemService{
	@Autowired
	private OrderItemRepository orderItemRepository;
	@Override
	public List<OrderItem> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public OrderItem findById(int theId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void save(OrderItem theItem) {
		orderItemRepository.save(theItem);
		
	}

	@Override
	public void deleteById(int theId) {
		// TODO Auto-generated method stub
		
	}

}
