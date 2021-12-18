package com.demo.springcore.db.propertyplaceholder;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
	ApplicationContext ac=new ClassPathXmlApplicationContext("com/demo/springcore/db/propertyplaceholder/config.xml");
	MyDAO dao=(MyDAO) ac.getBean("MyDAO");
	
	System.out.println(dao);
	}

}
