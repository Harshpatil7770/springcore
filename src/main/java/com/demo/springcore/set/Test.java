package com.demo.springcore.set;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ApplicationContext ac=new ClassPathXmlApplicationContext("com/demo/springcore/set/setconfig.xml");
		CarDealer car=(CarDealer) ac.getBean("carDealer");
		
		System.out.println(car.getName());
		System.out.println(car.getModels());
	}
}
