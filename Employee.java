package com.SingleInheritance;

public class Employee { //This is Parent Class
	
	public String strEmpID = "V1090";
	public String strCompanyName = "VSTL";
	
	public void getEmpName(String strFirstName, String strLastName) {
		
		String strFullEmpName = strFirstName +" "+ strLastName;
		System.out.println("Full Name : "+strFullEmpName);
		
	}
	
	public void getEmpID() {
		System.out.println("Employee ID : "+strEmpID);
		
	}
	
	public void getCompanyName() {
		System.out.println("Company Name is : "+strCompanyName);
	}
		

}
