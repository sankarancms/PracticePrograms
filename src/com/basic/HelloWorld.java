package com.basic;

public class HelloWorld {
	public String hello(){
		return "Hello World";
	}
	
	public static void main(String[] args) {
		HelloWorld hello =  new HelloWorld();
		System.out.println(hello.hello());
	
	}

}
