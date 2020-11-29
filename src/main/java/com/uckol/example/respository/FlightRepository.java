package com.uckol.example.respository;

import com.uckol.example.entity.Airline;
import com.uckol.example.entity.Flight;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface FlightRepository extends JpaRepository<Flight, Long> {
    List<Flight> findByNameContaining(String name);
}
