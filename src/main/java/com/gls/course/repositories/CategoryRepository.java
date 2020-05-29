package com.gls.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gls.course.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long>{

	
}
