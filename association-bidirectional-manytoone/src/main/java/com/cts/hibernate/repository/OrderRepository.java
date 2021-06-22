package com.cts.hibernate.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cts.hibernate.entity.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
