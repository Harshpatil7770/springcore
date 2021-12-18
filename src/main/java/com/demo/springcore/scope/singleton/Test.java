package com.demo.springcore.scope.singleton;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ApplicationContext ac=new ClassPathXmlApplicationContext("com/demo/springcore/scope/singleton/config.xml");
		
		Employee emp=(Employee) ac.getBean("employee");
		System.out.println(emp);
		System.out.println(emp.hashCode());
		Employee emp1=(Employee) ac.getBean("employee");
		System.out.println(emp1.hashCode());
	}
}
