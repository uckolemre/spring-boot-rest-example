package com.uckol.example.service;

import com.uckol.example.entity.Route;

import java.util.List;

public interface RouteService {

    Route save(Route Route);

    List<Route> findByName(String search);
}
