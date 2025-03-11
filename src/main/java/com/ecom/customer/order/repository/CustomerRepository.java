package com.ecom.customer.order.repository;


import com.ecom.customer.order.model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer, Long> { }