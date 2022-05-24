package com.MultilevelInheritance;

public class Father extends Grandfather {
	
	public String strFatherName = "XYZ";
	
	public String getFatherName() {
		
		System.out.println("Name of the Father : "+strFatherName);
		return strFatherName;
	}
	
	public void getFatherAge(int intFatherAge) {
		
		System.out.println("Age of the Father : "+intFatherAge);
		System.out.println("==================================================");
	}
	
	

}
