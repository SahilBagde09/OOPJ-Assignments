package com.example;

public class Vehicle {
	
	//Fields / Instance varibales.
	String model;
	float price;
	
	// 5 different varietns for the method overloading.
	private void setDetails() {
		System.out.println("setDetails() ");
		this.model = "Model XYZ";
		this.price = 673422.54f;	
	}
	
	private void setDetails(String model) {
		System.out.println("setDetails(String model)");
		this.model = model;
	}
	
	private void setDetails(float price) {
		System.out.println("setDetails(float price)");
		this.price = price;
	}
	
	private void setDetails(String model, float price) {
		System.out.println("setDetails(String model, float price)");
		this.model = model;
		this.price = price;
	}
	
	private void setDetails(float price, String model) {
		System.out.println("setDetails(float price, String model)");
		this.model = model;
		this.price = price;
	}
	
	
	public static void main(String[] args) {
		Vehicle vehicle = new Vehicle();
		
		vehicle.setDetails();
		vehicle.setDetails("Model DEF");
		vehicle.setDetails(346432.32f);
		vehicle.setDetails("Model HIJ", 423223.43f);
		vehicle.setDetails(893432.43f, "Model ABC");
		
	}
}
