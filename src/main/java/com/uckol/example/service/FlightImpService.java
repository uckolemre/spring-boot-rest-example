package com.uckol.example.service;

import com.uckol.example.entity.Flight;
import com.uckol.example.respository.AirportRepository;
import com.uckol.example.respository.FlightRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FlightImpService  implements FlightService{

    @Autowired
    FlightRepository flightRepository;

    @Override
    public Flight save(Flight flight) {
        return flightRepository.save(flight);
    }

    @Override
    public List<Flight> findByName(String search) {
        return flightRepository.findByNameContaining(search);
    }
}
