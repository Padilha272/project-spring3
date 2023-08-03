package com.matheuspadilha.project.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.matheuspadilha.project.entities.OrderItem;


public interface OrderItemRepository extends JpaRepository<OrderItem, Long>{

}
