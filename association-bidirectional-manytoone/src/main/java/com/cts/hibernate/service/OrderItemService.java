package com.cts.hibernate.service;

import java.util.List;

import com.cts.hibernate.entity.OrderItem;

public interface OrderItemService {
	public List<OrderItem> findAll();

	public OrderItem findById(int theId);

	public void save(OrderItem theItem);

	public void deleteById(int theId);
}
