package com.demo.springcore.lc.assignment;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class TicketReservation {
	
	private int id;
	
	private String name;
	
	

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@PostConstruct
	public void initialize() {
		System.out.println("initialize() called....");
	}
	@PreDestroy
	public void cleanup() {
		System.out.println("cleanup() called....");
	}
	@Override
	public String toString() {
		return "TicketReservation [id=" + id + ", name=" + name + "]";
	}
	
	
}
