package org.example.introtojpa.Repositories;

import org.example.introtojpa.Entities.FlightBooking;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface FlightBookingRepository extends JpaRepository<FlightBooking, Integer> {
    List<FlightBooking> findByCustomerId(Integer customerId);
}