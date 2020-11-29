package com.uckol.example.service;

import com.uckol.example.entity.Airport;
import com.uckol.example.entity.Airport;

import java.util.List;

public interface AirportService {

    Airport save(Airport Airport);

    List<Airport> findByName(String search);

}
