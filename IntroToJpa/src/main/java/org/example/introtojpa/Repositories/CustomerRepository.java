package org.example.introtojpa.Repositories;

import org.example.introtojpa.Entities.Customer;
import org.example.introtojpa.Enums.CustomerStatus;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CustomerRepository extends JpaRepository<Customer, Integer> {
    List<Customer> findByCustomerStatus(CustomerStatus status);
}