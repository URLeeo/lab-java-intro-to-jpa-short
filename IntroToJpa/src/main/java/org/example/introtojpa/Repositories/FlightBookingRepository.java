package org.example.introtojpa.Repositories;

import org.example.introtojpa.Entities.FlightBooking;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FlightBookingRepository extends JpaRepository<FlightBooking, Integer> {
}