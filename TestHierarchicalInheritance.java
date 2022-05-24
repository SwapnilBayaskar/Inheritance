package com.HierarchicalInheritance;

public class TestHierarchicalInheritance {

	public static void main(String[] args) {
		
		TATA objTATA = new TATA();
		objTATA.pringTATACarDetails();
		objTATA.getCarBrands();
		
		System.out.println("=====================================");
		
		Hyundai objHyundai = new Hyundai();
		objHyundai.printHyundaiCarDetails();
		objHyundai.getCarBrands();

	}

}
