package com.cts.hibernate.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cts.hibernate.entity.OrderItem;
@Repository
public interface OrderItemRepository extends JpaRepository<OrderItem, Integer>{

}
