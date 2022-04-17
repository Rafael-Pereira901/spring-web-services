package com.lad.springwebservices.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.lad.springwebservices.entities.Order;

@Repository
public interface OrderRepository extends JpaRepository<Order, Long> {}
