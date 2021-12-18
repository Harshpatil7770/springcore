package com.demo.springcore.db.propertyplaceholder.assignment;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
ApplicationContext ac=new ClassPathXmlApplicationContext("com/demo/springcore/db/propertyplaceholder/assignment/config.xml");
WsClinet ws=(WsClinet) ac.getBean("WsClinet");
System.out.println(ws);

	}

}
