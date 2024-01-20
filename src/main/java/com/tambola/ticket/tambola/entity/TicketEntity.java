package com.tambola.ticket.tambola.entity;

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.ElementCollection;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
@Entity
@Table(name="tambola_ticket")
public class TicketEntity {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long id;
	
	@ElementCollection
	private List<List<Integer>> number;

	public long getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public List<List<Integer>> getNumber() {
		return number;
	}

	public void setNumber(List<List<Integer>> number) {
		this.number = number;
	}
	
	
	
}
