package org.oop.demo;

public class Engine {
	
	private String make;
	private float capacityInCc;
	private int numCylinders;
	
	public Engine() {
		
	}
	
	public Engine(String make, float capacityInCc, int numCylinders) {
		this.make = make;
		this.capacityInCc = capacityInCc;
		this.numCylinders = numCylinders;
	}
	
	public void startEngine() throws InterruptedException {
		System.out.println("....");
		Thread.sleep(2000);
		System.out.println("Started");
	}

	public String getMake() {
		return make;
	}

	public void setMake(String make) {
		this.make = make;
	}

	public float getCapacityInCc() {
		return capacityInCc;
	}

	public void setCapacityInCc(float capacityInCc) {
		this.capacityInCc = capacityInCc;
	}

	public int getNumCylinders() {
		return numCylinders;
	}

	public void setNumCylinders(int numCylinders) {
		this.numCylinders = numCylinders;
	}
	
	
}
