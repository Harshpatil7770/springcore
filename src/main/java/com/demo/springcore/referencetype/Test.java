package com.demo.springcore.referencetype;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ApplicationContext ac=new ClassPathXmlApplicationContext("com/demo/springcore/referencetype/refconfig.xml");

		Student student=(Student) ac.getBean("student");
		
		System.out.println(student);
	}

}
