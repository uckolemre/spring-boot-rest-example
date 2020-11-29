package com.uckol.example.respository;

import com.uckol.example.entity.Airline;
import com.uckol.example.entity.Airport;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AirportRepository extends JpaRepository<Airport, Long> {
    List<Airport> findByNameContaining(String name);
}
