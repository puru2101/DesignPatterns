package startegyDesignPattern.withImpl;

import startegyDesignPattern.withImpl.driver.SpecialDriver;

public class OffRoadVehicle extends Vehicle {
	
	public OffRoadVehicle() {
	super(new SpecialDriver());
	
	}


}
