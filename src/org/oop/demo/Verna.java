package org.oop.demo;

public class Verna extends Vehicle {
	
	String tyreProfile;

	public Verna(Engine engine, Chassis chassis, Transmission transmission, String tyreProfile) {
		super(engine, chassis, transmission);
		this.tyreProfile = tyreProfile;
	}

}
