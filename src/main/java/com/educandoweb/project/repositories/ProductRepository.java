package com.educandoweb.project.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.educandoweb.project.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
