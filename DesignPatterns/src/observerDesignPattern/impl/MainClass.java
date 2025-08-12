package observerDesignPattern.impl;

public class MainClass {

	public static void main(String[] args) {
		WeatherStation weatherStation = new WeatherStation();

		DisplayObeserver phoneDisplay = new DisplayObeserver("Phone Display");
		DisplayObeserver laptopDisaply = new DisplayObeserver("Laptop Display");

		weatherStation.register(laptopDisaply);
		weatherStation.register(phoneDisplay);

		weatherStation.setTemp(98.0f);
		System.out.println("after and hour");
		weatherStation.setTemp(99.0f);

	}

}
