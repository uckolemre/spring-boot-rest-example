package com.uckol.example.service;

import com.uckol.example.entity.Flight;

import java.util.List;

public interface FlightService {

    Flight save(Flight Flight);

    List<Flight> findByName(String search);
}
