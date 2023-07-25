package com.matheuspadilha.project.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.matheuspadilha.project.entities.User;

public interface UserRepository extends JpaRepository<User,Long>{

}
