package com.devsuperior.wspereira.dsdeliver.services;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.devsuperior.wspereira.dsdeliver.dto.ProductDTO;
import com.devsuperior.wspereira.dsdeliver.entities.Product;
import com.devsuperior.wspereira.dsdeliver.repositories.ProductRepository;

@Service  						// Registrando o componente no sistema do Spring Boot
public class ProductService {
	
	@Autowired
	private ProductRepository repository;
	
	// Buscando os produtos
	@Transactional(readOnly = true)
	public List<ProductDTO> findAll(){
		List<Product> list = repository.findAllByOrderByNameAsc();
		return list.stream().map(x -> new ProductDTO(x)).collect(Collectors.toList());
	}
	
}
