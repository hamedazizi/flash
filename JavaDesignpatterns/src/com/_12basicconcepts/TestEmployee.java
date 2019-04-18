package com._12basicconcepts;

public class TestEmployee {

	public static void main(String[] args) {

		//Employee obj1 = new Employee();//here we r creating records with giving any values.
		
		Employee obj1 =new Employee(100, "Alex");
		obj1.notifyEmployee();
		
		Employee obj2 =new Employee(200, "Lynda");
		
	}

}
