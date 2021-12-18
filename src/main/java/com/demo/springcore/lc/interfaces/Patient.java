package com.demo.springcore.lc.interfaces;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Patient implements InitializingBean,DisposableBean{

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

	public void destroy() throws Exception {
		System.out.println("destory method called....");
		
	}

	public void afterPropertiesSet() throws Exception {
		System.out.println("init() method called....");
		
	}

	@Override
	public String toString() {
		return "Patient [id=" + id + ", name=" + name + "]";
	}
	
	
	
	
	
	
}
