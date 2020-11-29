package com.uckol.example.service;

import com.uckol.example.entity.Airport;
import com.uckol.example.respository.AirportRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AirportImpService implements AirportService{
    @Autowired
    AirportRepository airportRepository;

    @Override
    public Airport save(Airport airport) {
        return airportRepository.save(airport);
    }

    @Override
    public List<Airport> findByName(String search) {
        return airportRepository.findByNameContaining(search);
    }
}
