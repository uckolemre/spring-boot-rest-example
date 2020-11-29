package com.uckol.example.controller;

import com.uckol.example.entity.Flight;
import com.uckol.example.entity.Route;
import com.uckol.example.service.FlightService;
import com.uckol.example.service.RouteService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/route-service")
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class RouteContoller {

    RouteService routeService;

    @PostMapping("/route")
    public Route create(@RequestBody Route route){
        return routeService.save(route);
    }


    @GetMapping("/route/{search}")
    public List<Route> get(@PathVariable String  search){
        return routeService.findByName(search);
    }
}
