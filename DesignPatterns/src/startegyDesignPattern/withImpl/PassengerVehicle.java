package startegyDesignPattern.withImpl;

import startegyDesignPattern.withImpl.driver.NormalDrive;

public class PassengerVehicle extends Vehicle {

	public PassengerVehicle() {
		super(new NormalDrive());
	}
}
