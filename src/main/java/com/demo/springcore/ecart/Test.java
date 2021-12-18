package com.demo.springcore.ecart;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) {
		
	ApplicationContext ac=new ClassPathXmlApplicationContext("com/demo/springcore/ecart/ecartconfig.xml");
	
	ShoppingCart sc=(ShoppingCart) ac.getBean("shoppingcart");
	
System.out.println(sc);
}
}
