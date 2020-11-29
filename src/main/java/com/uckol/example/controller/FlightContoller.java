package com.uckol.example.controller;

import com.uckol.example.entity.Airport;
import com.uckol.example.entity.Flight;
import com.uckol.example.service.AirportService;
import com.uckol.example.service.FlightService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/flight-service")
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class FlightContoller {

    FlightService flightService;

    @PostMapping("/flight")
    public Flight create(@RequestBody Flight flight){
        return flightService.save(flight);
    }


    @GetMapping("/flight/{search}")
    public List<Flight> get(@PathVariable String  search){
        return flightService.findByName(search);
    }
}
