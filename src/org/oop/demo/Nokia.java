package org.oop.demo;


public class Nokia extends MobilePhone{

	public Nokia(String make, String model, float screenSize) {
		super(make, model, screenSize);
		
	}
	// Child class extends ONLY parent parameterized constructor and 
	// hence requires values to be provided during initialization
	
	public void callNumber(long number, String networkCarrier) {
		if(networkCarrier.equals("AIRTEL")) {
			System.out.println("International calling allowed");
			System.out.println("calling...");
			System.out.println("Number : "+number);
		}
	}
	
	public void callNumber(String networkCarrier) {
		System.out.println("Inferring number from phonebook");
		System.out.println("Calling using "+networkCarrier);
	}
	
	public static void main(String[] args) {
		Nokia n6600 = new Nokia("Nokia", "6600", 4.5f);
		n6600.callNumber("AIRTEL");
	}
	
	public void fetchNetworkCarrierFrequency() {
		// IMPLEMENTATION FROM PARENT ABSTRACT CLASS GOES HERE
	}
}
