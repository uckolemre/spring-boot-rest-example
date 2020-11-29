package com.uckol.example.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/ticket-service")
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class TicketContoller {
}
