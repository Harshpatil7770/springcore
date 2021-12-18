package com.demo.springcore.lc.annotations;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.context.annotation.PropertySources;

public class Patient {

	private int id;
	
	private String name;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		System.out.println("setter method called...");
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	@PostConstruct
	public void init() {
		System.out.println("init() method called....");
	}
	@PreDestroy
	public void destry() {
		System.out.println("destory() method called.....");
	}

	@Override
	public String toString() {
		return "Patient [id=" + id + ", name=" + name + "]";
	}
	
	
	
}
