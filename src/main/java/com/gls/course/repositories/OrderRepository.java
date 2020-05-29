package com.gls.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gls.course.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long>{

	
}
