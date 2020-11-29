package com.uckol.example.respository;

import com.uckol.example.entity.Airline;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface AirlineRepository extends JpaRepository<Airline, Long> {

    List<Airline> findByNameContaining(String name);
}
