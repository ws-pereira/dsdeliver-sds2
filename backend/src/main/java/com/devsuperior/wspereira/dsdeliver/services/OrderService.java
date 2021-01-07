package com.devsuperior.wspereira.dsdeliver.services;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.devsuperior.wspereira.dsdeliver.dto.OrderDTO;
import com.devsuperior.wspereira.dsdeliver.entities.Order;
import com.devsuperior.wspereira.dsdeliver.repositories.OrderRepository;

@Service  						// Registrando o componente no sistema do Spring Boot
public class OrderService {
	
	@Autowired
	private OrderRepository repository;
	
	// Buscando os produtos
	@Transactional(readOnly = true)
	public List<OrderDTO> findAll(){
		List<Order> list = repository.findOrdersWithProducts();
		return list.stream().map(x -> new OrderDTO(x)).collect(Collectors.toList());
	}
	
}
