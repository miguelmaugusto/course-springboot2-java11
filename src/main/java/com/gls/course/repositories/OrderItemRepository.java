package com.gls.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gls.course.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long>{

	
}
