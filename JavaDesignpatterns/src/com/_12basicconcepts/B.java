package com._12basicconcepts;

public class B extends A {
	
	public void methodB() {
		System.out.println("B = MB");
	}
	 ///THE methodA of class A has been overriden in ClassB
	public void methodA() {
		System.out.println("B - MA");
	}

}
