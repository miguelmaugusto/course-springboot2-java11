package com.gls.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gls.course.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long>{

	
}
