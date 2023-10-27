package com.polymorphism;
class Demo {
	void sysso () {
		System.out.println("Welcome to Base (demo) class");
	}
	
}

public class MethodOverridingDemo extends Demo{
	
	void syso() {
		System.out.println("welcome to Derived class");
	}
	public static void main (String [] args) {
		MethodOverridingDemo obj = new MethodOverridingDemo ();
		
		obj.syso();
	}
}
