package com.HierarchicalInheritance;

public class TATA extends Cars{
	
	public String strTataCar = "Altroz";
	
	public void getTATACar() {
		
		System.out.println("Name of the TATA Car : "+strTataCar);
	}
	
	public void getCarAvg(int intAvg) {
		
		System.out.println("Avg of "+strTataCar+" : "+intAvg);
	}
	
	public void getBrandName() {
		
		System.out.println("Brand names are : ");
		Cars objCars = new Cars();
		objCars.getCarBrands();
		
	}
	
	public void pringTATACarDetails() {
		
		getCarBrands(); //Parent Class method
		getTATACar();
		getCarAvg(24);
	}

}
