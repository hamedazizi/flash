package com._12basicconcepts;

public class Test {

	public static void main(String[] args) {

		System.out.println("aobj");
		A aobj =new A();
		
		aobj.methodA();
		
		System.out.println("bobj");
		B bobj =new B();//this one can return both method A & B, because A extended B
		bobj.methodA();
		bobj.methodB();
		
		//SupperClass obj = new SubClass
		int x = 10;
		A obj = new B();
		obj.methodA();
		
		//not possible
		//B obj2 = new A();
		
		
		

	}

}
