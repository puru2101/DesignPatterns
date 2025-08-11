package startegyDesignPattern.withImpl;

import startegyDesignPattern.withImpl.driver.SpecialDriver;

public class SportyVehicle extends Vehicle {

	public SportyVehicle() {
		super(new SpecialDriver());
	}
}
