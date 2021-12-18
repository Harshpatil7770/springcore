package com.demo.springcore.lc;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		AbstractApplicationContext ac=new ClassPathXmlApplicationContext("com/demo/springcore/lc/lcconfig.xml");
		Patient pt=(Patient) ac.getBean("patient");
		
		System.out.println(pt);
        ac.registerShutdownHook();
	}

}
