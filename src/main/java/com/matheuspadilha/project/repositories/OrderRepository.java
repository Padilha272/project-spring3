package com.matheuspadilha.project.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.matheuspadilha.project.entities.Order;

public interface OrderRepository extends JpaRepository<Order,Long> {

}
