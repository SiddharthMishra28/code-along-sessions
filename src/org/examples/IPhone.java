package org.examples;

public class IPhone {
	
	private Battery battery;
	private Casing casing;
	private Display display;
	
	
	
	
	
	public IPhone(Battery battery, Casing casing, Display display) {
		this.battery = battery;
		this.casing = casing;
		this.display = display;
	}


	public Battery getBattery() {
		return battery;
	}





	public void setBattery(Battery battery) {
		this.battery = battery;
	}





	public Casing getCasing() {
		return casing;
	}





	public void setCasing(Casing casing) {
		this.casing = casing;
	}





	public Display getDisplay() {
		return display;
	}


	public void setDisplay(Display display) {
		this.display = display;
	}

	
	public void validateFunction() {
		if(this.battery.getChargePercent() < 1) {
			this.display.displayFeed("CHARGE URGENTLY!");
		}
	}


	public static void main(String[] args) {
		Battery b = new Battery();
		b.setChargePercent(50);
		b.setCapacity("5000");
		
		Casing c  =new Casing();
		c.setMaterial("hardenedGlass");
		
		Display d = new Display();
		d.setSize(6.0f);
		d.setType("OLED");
		
		Display d2 = new Display();
		d2.setSize(4.5f);
		d2.setType("LCD");
		
		IPhone sidsIphone = new IPhone(b, c, d2);
		sidsIphone.getDisplay().getSize();
	}
}
