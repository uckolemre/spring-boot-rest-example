package com.uckol.example.service;

import com.uckol.example.entity.Airline;
import com.uckol.example.respository.AirlineRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
public class AirlineImpService implements AirlineService{

    @Autowired
    AirlineRepository airlineRepository;

    @Override
    @Transactional
    public Airline save(Airline airline) {
        return airlineRepository.save(airline);
    }

    @Override
    public List<Airline> findByName(String search) {
        return airlineRepository.findByNameContaining(search);
    }


}
