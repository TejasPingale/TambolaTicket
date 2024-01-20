package com.tambola.ticket.tambola.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tambola.ticket.tambola.entity.TicketEntity;

public interface TicketRepo extends JpaRepository<TicketEntity,Long> {

}
