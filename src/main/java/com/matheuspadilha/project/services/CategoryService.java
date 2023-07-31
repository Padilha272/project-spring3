package com.matheuspadilha.project.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.matheuspadilha.project.entities.Category;
import com.matheuspadilha.project.repositories.CategoryRepository;

@Service
public class CategoryService {

	@Autowired
	private CategoryRepository repository;
	
	public List<Category> findAll(){
		return repository.findAll();
	}
	
	public Category getById(Long id) {
		Optional<Category> obj = repository.findById(id);
		return obj.get();
	}
	
}
