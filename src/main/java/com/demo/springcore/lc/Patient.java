package com.demo.springcore.lc;

public class Patient {

	private int id;
	
	private String name;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		System.out.println("Setter method is called ....");
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public void init() {
		System.out.println("init method is called.......");
	}

	public void destory() {
		System.out.println("Destory method is called.....");
	}
	@Override
	public String toString() {
		return "Patient [id=" + id + ", name=" + name + "]";
	}
	
	
}
