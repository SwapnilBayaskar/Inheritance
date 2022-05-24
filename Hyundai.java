package com.HierarchicalInheritance;

public class Hyundai extends Cars{
	
	String strHyundaiCar = "i20 Sportz";
	
	public void getHyundaiCar() {
		
		System.out.println("Name of the Hyundai Car : "+strHyundaiCar);
	}
	
	public void getHyundaiCarAvg(int intHyundaiAvg) {
		
		System.out.println("Average of "+strHyundaiCar+" is : "+intHyundaiAvg);
	}
	
	public void printHyundaiCarDetails() {
		
		getCarBrands(); //Parent class method
		getHyundaiCar();
		getHyundaiCarAvg(18);
	}

}
