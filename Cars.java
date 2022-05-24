package com.HierarchicalInheritance;

public class Cars {
	
	public void getCarBrands() {
		
		String strCarArray[] = {"TATA", "Maruti", "Hyundai", "Mahindra"};
		
		System.out.println("Brands of Cars");
		for(int intCount = 0; intCount<strCarArray.length; intCount++) {
			System.out.println(strCarArray[intCount]);
		}
	}

}
