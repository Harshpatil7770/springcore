package com.demo.springcore.dependecycheck;

import org.springframework.context.ApplicationContext;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
	ApplicationContext ac=new ClassPathXmlApplicationContext("com/demo/springcore/dependecycheck/config.xml");
	
	Prescription ps=(Prescription) ac.getBean("presciption");
	System.out.println(ps);
	
	}

}
