package com.ecom.customer.order.repository;

import com.ecom.customer.order.model.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> { }
