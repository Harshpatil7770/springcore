package com.demo.springcore.properties;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ApplicationContext ac=new ClassPathXmlApplicationContext("com/demo/springcore/properties/propertiesconfig.xml");
		
		CountiresAndLangs ca=(CountiresAndLangs) ac.getBean("countriesandlanguage");
		
		System.out.println(ca);

	}

}
