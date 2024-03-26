package org.oop.demo;

public abstract class MobilePhone {
	
	private String make;
	private String model;
	private float screenSize;

	// Single parameterized constructor
	public MobilePhone(String make, String model, float screenSize) {
		this.make = make;
		this.model = model;
		this.screenSize = screenSize;
	}
	
	public void showPhoneDetails() {
		System.out.println("Phone details are : ");
		System.out.println("Make : "+this.make);
		System.out.println("Model : "+this.model);
		System.out.println("Screen Size : "+this.screenSize);
	}
	
	public void callNumber(long number) {
		System.out.println("Calling...");
		System.out.println("Number : "+number);
	}
	
	public abstract void fetchNetworkCarrierFrequency();
	
	
}

