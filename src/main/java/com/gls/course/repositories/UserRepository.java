package com.gls.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gls.course.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{

	
}
