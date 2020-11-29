package com.uckol.example.controller;

import com.uckol.example.entity.Airline;
import com.uckol.example.service.AirlineService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/airline-service")
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class AirlineContoller {

    @Autowired
    AirlineService airlineService;

    @PostMapping("/airline")
    public Airline create(@RequestBody Airline airline){
        return airlineService.save(airline);
    }


    @GetMapping("/airline/{search}")
    public List<Airline> get(@PathVariable String  search){
        return airlineService.findByName(search);
    }
}
