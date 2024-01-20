package com.tambola.ticket.tambola.service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tambola.ticket.tambola.entity.TicketEntity;
import com.tambola.ticket.tambola.repository.TicketRepo;

@Service
public class TicketService {

	@Autowired
	private TicketRepo ticketRepo;

	public TicketService(TicketRepo ticketRepo) {
		super();
		this.ticketRepo = ticketRepo;
	}
	
	public TicketEntity createNewTicketSeat() {
		List<Integer> numbers = new ArrayList<>();
        for (int i = 1; i <= 90; i++) {  //for to consider numbers upto 1-90
            numbers.add(i);
        }
        Collections.shuffle(numbers);  // Shuffle the numbers

        List<List<Integer>> ticket = new ArrayList<>();
        int colIncrement = 10;    //start from 11 id 
        for (int i = 0; i < 3; i++) {    // for upto 3 rows
            List<Integer> row = new ArrayList<>();
            int start = i * colIncrement + 1;
            int end = start + colIncrement - 1;
            int index = 0;
            for (int num = start; num <= end; num++) {
                if (numbers.contains(num)) {
                    row.add(num);
                    numbers.remove(Integer.valueOf(num));  // Remove the selected number
                    index++;
                }
                if (index == 5) {
                    break;
                }
            }
            Collections.sort(row);  // Sort the row
            ticket.add(row);
            return (TicketEntity) ticket;
            
        }
		return ticketRepo.save(new TicketEntity());
	}
	
	public List<TicketEntity> getAllTicket(){
		return ticketRepo.findAll();
	}
	
}
