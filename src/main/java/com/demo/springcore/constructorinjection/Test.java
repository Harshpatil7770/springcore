package com.demo.springcore.constructorinjection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
	ApplicationContext ac=new ClassPathXmlApplicationContext("com/demo/springcore/constructorinjection/config.xml");
	
	Employee e=(Employee) ac.getBean("employee");
	System.out.println(e);
	}

}
