package com.demo.springcore.lc.interfaces;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		AbstractApplicationContext ac=new ClassPathXmlApplicationContext("com/demo/springcore/lc/interfaces/interfacelc.xml");
		
		Patient patient=(Patient) ac.getBean("patient");
		
		System.out.println(patient);
		
		ac.registerShutdownHook();
	}
}
