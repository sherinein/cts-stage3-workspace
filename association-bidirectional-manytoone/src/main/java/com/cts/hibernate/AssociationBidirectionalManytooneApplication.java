package com.cts.hibernate;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.cts.hibernate.entity.Order;
import com.cts.hibernate.entity.OrderItem;
import com.cts.hibernate.service.OrderItemService;
import com.cts.hibernate.service.OrderItemServiceImpl;

@SpringBootApplication
public class AssociationBidirectionalManytooneApplication {

	public static void main(String[] args) {
		ApplicationContext context=SpringApplication.run(AssociationBidirectionalManytooneApplication.class, args);
		OrderItemService orderItemService=context.getBean(OrderItemServiceImpl.class);
		Order order = new Order();
		OrderItem item1 = new OrderItem();
		item1.setItemName("Pen");
		//item1.setOrder(order);
		OrderItem item2 = new OrderItem();
		item2.setItemName("Pencil");
		//item2.setOrder(order);
		OrderItem item3 = new OrderItem();
		item3.setItemName("Bag");
		//item3.setOrder(order);
		List<OrderItem> listOfItem = new ArrayList<OrderItem>();
		listOfItem.add(item1);
		listOfItem.add(item2);
		listOfItem.add(item3);
		
		//orderItemService.save(item1);
		//orderItemService.save(item2);
		//orderItemService.save(item3);
		
	}

}
