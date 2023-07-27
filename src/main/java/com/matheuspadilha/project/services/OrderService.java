package com.matheuspadilha.project.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.matheuspadilha.project.entities.Order;
import com.matheuspadilha.project.repositories.OrderRepository;

@Service
public class OrderService {

	@Autowired
	private OrderRepository repository;
	
	public List<Order> findAll(){
		return repository.findAll();
	}
	
	public Order getById(Long id) {
		Optional<Order> obj = repository.findById(id);
		return obj.get();
	}
}
