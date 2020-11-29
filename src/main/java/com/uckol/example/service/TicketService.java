package com.uckol.example.service;

import com.uckol.example.entity.Ticket;

import java.util.List;

public interface TicketService {
    Ticket findByTicketNumber(String ticketNumber);

    Ticket save(Ticket ticket);
}
