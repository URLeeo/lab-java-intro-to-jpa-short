package org.example.introtojpa.Repositories;

import org.example.introtojpa.Entities.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer, Integer> {
}