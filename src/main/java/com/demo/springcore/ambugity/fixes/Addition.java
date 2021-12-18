package com.demo.springcore.ambugity.fixes;

public class Addition {

	Addition(double a,double b){
		System.out.println("double called");
	}
Addition(int a,int b){
	System.out.println("int called");
	}
Addition(String a,String b){
	System.out.println("String called");
}
	
}
