package org.examples;

public class Battery {
	
	private int chargePercent;
	private String capacity;
	public static int FINAL_CAPACITY = 100;
	
	public int getChargePercent() {
		return chargePercent;
	}
	public void setChargePercent(int chargePercent) {
		this.chargePercent = chargePercent;
	}
	public String getCapacity() {
		return capacity;
	}
	public void setCapacity(String capacity) {
		this.capacity = capacity;
	}
	
	public void charge(int chargeFeed) {
		if(chargeFeed < FINAL_CAPACITY) {
			chargeFeed++;
		}
	}
}
