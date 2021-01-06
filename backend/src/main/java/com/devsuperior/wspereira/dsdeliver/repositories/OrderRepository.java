package com.devsuperior.wspereira.dsdeliver.repositories;

import org.springframework.data.jpa.repository.support.JpaRepositoryImplementation;

import com.devsuperior.wspereira.dsdeliver.entities.Order;

public interface OrderRepository extends JpaRepositoryImplementation<Order, Long>{
	
}
