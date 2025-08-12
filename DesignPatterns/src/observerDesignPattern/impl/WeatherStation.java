package observerDesignPattern.impl;

import java.util.ArrayList;
import java.util.List;

public class WeatherStation implements Observable {
	List<Observer> ls = new ArrayList<>();
	private float temp;

	@Override
	public void register(Observer obj) {
		ls.add(obj);
	}
	@Override
	public void deRegister(Observer obj) {
		ls.remove(obj);
	}
	public void setTemp(float temp) {
		this.temp = temp;
		notification();
	}
	@Override
	public void notification() {
		for (Observer obj : ls) {
			obj.update(temp);
		}
	}
}
