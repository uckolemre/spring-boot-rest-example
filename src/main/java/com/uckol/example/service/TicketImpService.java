package com.uckol.example.service;

import com.uckol.example.entity.Ticket;
import com.uckol.example.respository.TicketRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

@Service
public class TicketImpService implements TicketService{

    @Autowired
    TicketRepository ticketRepository;

    @Override
    public Ticket findByTicketNumber(String ticketNumber) {
        return ticketRepository.findByTicketNumber(ticketNumber);
    }

    @Override
    public Ticket save(Ticket ticket) {
        return ticketRepository.save(ticket);
    }
}
