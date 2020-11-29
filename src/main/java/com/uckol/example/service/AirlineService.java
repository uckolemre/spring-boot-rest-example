package com.uckol.example.service;

import com.uckol.example.entity.Airline;

import java.util.List;

public interface AirlineService {

    Airline save(Airline airline);


    List<Airline> findByName(String search);
}
