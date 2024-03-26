package org.oop.demo;

public class InheritanceDemo {
	
	public static void main(String[] args) {
		Engine e1 = new Engine();
		Chassis c1 = new Chassis();
		Transmission t1 = new Transmission();
		Verna blueVerna = new Verna(e1, c1, t1, "Low Profile");
	}
}
