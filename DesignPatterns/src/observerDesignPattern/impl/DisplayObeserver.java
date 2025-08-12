package observerDesignPattern.impl;

public class DisplayObeserver implements Observer {

	private String deviceName;

	public DisplayObeserver(String deviceName) {
		super();
		this.deviceName = deviceName;
	}

	@Override
	public void update(float temp) {
		System.out.println(deviceName +" - :Temprature: " + temp);
	}	
}
