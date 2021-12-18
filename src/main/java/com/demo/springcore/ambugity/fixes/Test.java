package com.demo.springcore.ambugity.fixes;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ApplicationContext ac=new ClassPathXmlApplicationContext("com/demo/springcore/ambugity/fixes/config.xml");
		
		Addition add=(Addition) ac.getBean("addition");
		
		System.out.println(add);

	}

}
