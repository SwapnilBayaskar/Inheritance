package com.MultilevelInheritance;

public class Son extends Father {
	
	public String strSonName1 = "Sachin";
	public String strSonName2 = "Rohit";
	
	public void getSonName() {
		
		System.out.println("Name of first son : "+strSonName1);
		System.out.println("Name of second son : "+strSonName2);
	}
	
	public void getSonAge(int intAge1, int intAge2) {
		
		System.out.println("Age of first son : "+intAge1);
		System.out.println("Age of second son : "+intAge2);
	}
	
	public void getFamilyNames() {
		
		Grandfather objGrandfather = new Grandfather();
		String strGrandfather = objGrandfather.getGrandfatherName();
		//System.out.println("Grandfather Name of sons : "+strGrandfather);
		
		Father objFather = new Father();
		String strFather = objFather.getFatherName();
		//System.out.println("Father Name of sons : "+strFather);
	}
	
	public void printFamilyDetails() {
		
		this.getGrandfatherName();
		this.getAge(70);
		this.getFatherName();
		this.getFatherAge(50);
		this.getSonName();
		this.getSonAge(25, 20);
		this.getFamilyNames();
	}

}
