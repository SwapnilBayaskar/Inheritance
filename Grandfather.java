package com.MultilevelInheritance;

public class Grandfather {
	
	public String strName = "ABC";
	
	public String getGrandfatherName() {
		
		System.out.println("Name of the Grandfather : "+strName);
		return strName;
	}
	
	public void getAge(int intAge) {
		
		System.out.println("Age of Grandfather : "+intAge);
		System.out.println("==========================================");
	}

}
