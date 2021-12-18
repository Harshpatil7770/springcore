package com.demo.springcore.map;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
	ApplicationContext ac=new ClassPathXmlApplicationContext("com/demo/springcore/map/mapconfig.xml");
	Customer customer=(Customer) ac.getBean("customer");
	
	System.out.println(customer.getId());
	System.out.println(customer.getProducts());
	}

}
