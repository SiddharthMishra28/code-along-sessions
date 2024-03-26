package org.examples;

public class Casing {
	
	private String material;

	public String getMaterial() {
		return material;
	}

	public void setMaterial(String material) {
		this.material = material;
	}
	
	public void pressVolumeUp() {
		System.out.println("Volume Increasing");
	}
	
	public void pressVolumeDown() {
		System.out.println("Volume Decreasing");
	}
	
	public void pressPowerButton() {
		System.out.println("Powering On!");
	}
}
