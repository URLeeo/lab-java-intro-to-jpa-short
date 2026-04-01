package org.example.introtojpa.Repositories;

import org.example.introtojpa.Entities.Flight;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FlightRepository extends JpaRepository<Flight, Integer> {
}