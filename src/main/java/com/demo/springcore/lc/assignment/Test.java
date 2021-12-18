package com.demo.springcore.lc.assignment;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		AbstractApplicationContext ac=new ClassPathXmlApplicationContext("com/demo/springcore/lc/assignment/config.xml");
		
		TicketReservation tr=(TicketReservation) ac.getBean("tikitReservation");
		
		System.out.println(tr);
		ac.registerShutdownHook();
		
		

	}

}
