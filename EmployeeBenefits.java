package com.SingleInheritance;

public class EmployeeBenefits extends Employee { //This is Child class
	
	public int intSalary = 15000;
	
	public void getEmpSalary() {
		System.out.println("Salary of Employee is : "+intSalary);
	}
	
	public void printEmpDetails() {
		this.getEmpName("Rohit", "Deshmukh");
		this.getEmpID();
		this.getCompanyName();
		
		this.getEmpSalary(); //method from child class
	}

}
