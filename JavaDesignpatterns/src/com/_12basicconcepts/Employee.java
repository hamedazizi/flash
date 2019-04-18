package com._12basicconcepts;

public class Employee {
	int empId;
	String empName;
	double salary;
	public double getSalary() {
		return salary;
	}


	public void setSalary(double salary) {
		this.salary = salary;
	}


	int grade;
	String company ="IBM";
	
	Email email;
	
	public Employee(int empId, String empName) {
		
		this.empId =empId;
		this.empName = empName; //
	}
	public void notifyEmployee() {
		email.sendEmail();
	}

}
