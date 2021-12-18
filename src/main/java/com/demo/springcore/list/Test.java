package com.demo.springcore.list;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String args[]) {
		ApplicationContext ac=new ClassPathXmlApplicationContext("com/demo/springcore/list/listconfig.xml");
		Hospital hospital=(Hospital) ac.getBean("hospital");
		
		System.out.println("Hospital Name : "+hospital.getName());
		System.out.println("Department Name : "+hospital.getDepartments());
		System.out.println(hospital.getDepartments().getClass());
		// By default spring uses ArrayList
	}
}
