package startegyDesignPattern.withImpl;

import startegyDesignPattern.withImpl.driver.StartegyDriver;

public class Vehicle {

	StartegyDriver startegyDriver;

	public Vehicle(StartegyDriver startegyDriver) {
		this.startegyDriver = startegyDriver;
	}

	public void drive() {
		startegyDriver.drive();
	}

}
