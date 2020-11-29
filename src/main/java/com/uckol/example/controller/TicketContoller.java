package com.uckol.example.controller;

import com.uckol.example.entity.Ticket;
import com.uckol.example.service.TicketService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/ticket-service")
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class TicketContoller {


    TicketService ticketService;

    @PostMapping("/ticket")
    public Ticket create(@RequestBody Ticket ticket){
        return ticketService.save(ticket);
    }


    @GetMapping("/route/{ticketNumber}")
    public Ticket get(@PathVariable String  ticketNumber){
        return ticketService.findByTicketNumber(ticketNumber);
    }
}
