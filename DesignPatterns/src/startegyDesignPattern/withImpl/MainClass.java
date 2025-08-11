package startegyDesignPattern.withImpl;

public class MainClass {

	public static void main(String[] args) {
		Vehicle offRoadVehicle = new OffRoadVehicle();
		offRoadVehicle.drive();

		Vehicle passengerVehicle = new PassengerVehicle();
		passengerVehicle.drive();
	}

}
