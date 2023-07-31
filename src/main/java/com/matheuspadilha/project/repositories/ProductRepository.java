package com.matheuspadilha.project.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.matheuspadilha.project.entities.Product;

public interface ProductRepository extends JpaRepository<Product,Long>{

}
