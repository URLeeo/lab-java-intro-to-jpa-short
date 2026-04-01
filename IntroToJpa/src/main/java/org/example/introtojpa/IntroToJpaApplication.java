package org.example.introtojpa;

import org.example.introtojpa.Entities.Customer;
import org.example.introtojpa.Entities.Flight;
import org.example.introtojpa.Entities.FlightBooking;
import org.example.introtojpa.Enums.CustomerStatus;
import org.example.introtojpa.Repositories.CustomerRepository;
import org.example.introtojpa.Repositories.FlightBookingRepository;
import org.example.introtojpa.Repositories.FlightRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class IntroToJpaApplication {

    public static void main(String[] args) {
        SpringApplication.run(IntroToJpaApplication.class, args);
        System.out.println("Airplane App has been launched...");
    }
    @Bean
    CommandLineRunner run(CustomerRepository customerRepository,
                          FlightRepository flightRepository,
                          FlightBookingRepository flightBookingRepository) {
        return args -> {

            Customer customer1 = customerRepository.save(
                    new Customer("Leo Merdanly", CustomerStatus.GOLD, 120000)
            );
            Customer customer2 = customerRepository.save(
                    new Customer("Aslan Mammadzada", CustomerStatus.SILVER, 60000)
            );
            Customer customer3 = customerRepository.save(
                    new Customer("Leon s Kennedy", CustomerStatus.NONE, 15000)
            );

            Flight flight1 = flightRepository.save(
                    new Flight("AB123", "Boeing 747", 400, 135)
            );
            Flight flight2 = flightRepository.save(
                    new Flight("BC123", "Airbus A330", 236, 4370)
            );
            Flight flight3 = flightRepository.save(
                    new Flight("CD123", "Boeing 777", 264, 2078)
            );

            flightBookingRepository.save(
                    new FlightBooking(customer1.getCustomerId(), flight1.getFlightId())
            );
            flightBookingRepository.save(
                    new FlightBooking(customer1.getCustomerId(), flight2.getFlightId())
            );
            flightBookingRepository.save(
                    new FlightBooking(customer2.getCustomerId(), flight3.getFlightId())
            );
        };
    }
}