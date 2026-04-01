package org.example.introtojpa.Repositories;

import org.example.introtojpa.Entities.Flight;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface FlightRepository extends JpaRepository<Flight, Integer> {
    List<Flight> findByFlightMileageGreaterThan(Integer flightMileage);
}