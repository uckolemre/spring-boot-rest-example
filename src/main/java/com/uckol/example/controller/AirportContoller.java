package com.uckol.example.controller;

import com.uckol.example.entity.Airport;
import com.uckol.example.service.AirportService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/airport-service")
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class AirportContoller {

    AirportService airportService;

    @PostMapping("/airport")
    public Airport create(@RequestBody Airport airport){
        return airportService.save(airport);
    }


    @GetMapping("/airport/{search}")
    public List<Airport> get(@PathVariable String  search){
        return airportService.findByName(search);
    }

}
