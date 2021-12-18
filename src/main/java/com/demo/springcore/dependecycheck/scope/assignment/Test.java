package com.demo.springcore.dependecycheck.scope.assignment;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
	ApplicationContext ac=new ClassPathXmlApplicationContext("com/demo/springcore/dependecycheck/scope/assignment/config.xml");
	
	University unv=(University) ac.getBean("university");
	System.out.println(unv);
	System.out.println(unv.hashCode());

	University unv1=(University) ac.getBean("university");
	System.out.println(unv1.hashCode());
	
	
	}

}
