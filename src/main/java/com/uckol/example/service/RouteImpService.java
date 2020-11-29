package com.uckol.example.service;

import com.uckol.example.entity.Route;
import com.uckol.example.respository.FlightRepository;
import com.uckol.example.respository.RouteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RouteImpService implements RouteService{

    @Autowired
    RouteRepository routeRepository;

    @Override
    public Route save(Route route) {
        return routeRepository.save(route);
    }

    @Override
    public List<Route> findByName(String search) {
        return routeRepository.findByNameContaining(search);
    }
}
