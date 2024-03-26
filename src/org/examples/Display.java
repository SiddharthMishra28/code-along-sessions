package org.examples;

public class Display {
	
	private String type;
	private float size;
	
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public float getSize() {
		return size;
	}
	public void setSize(float size) {
		this.size = size;
	}
	
	public void displayFeed(String value) {
		System.out.println("Displaying the feed!");
	}
	
}
