package com.demo.springcore;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
	
		ClassPathXmlApplicationContext cp=new ClassPathXmlApplicationContext("config.xml");
		Employee e1=(Employee) cp.getBean("emp");
		System.out.println("Employee Id : "+e1.getId());
		System.out.println("Employee name : "+e1.getEmployeeName());

	}

}
