package com.educandoweb.project.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.educandoweb.project.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {

}
