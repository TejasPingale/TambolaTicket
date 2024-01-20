package com.tambola.ticket.tambola.controller;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tambola.ticket.tambola.entity.TicketEntity;
import com.tambola.ticket.tambola.service.TicketService;

@RestController
@RequestMapping("/tambola/")
public class TicketController {

	@Autowired
	private TicketService ticketService;
	
	@PostMapping("insert")
	public TicketEntity createNewTambolaSets(@RequestBody int n) {
		
		return ticketService.createNewTicketSeat();
       
	}
	@GetMapping("tickets")
	public List<TicketEntity> fetchSavedTicket(){
		return ticketService.getAllTicket();
	}
}
