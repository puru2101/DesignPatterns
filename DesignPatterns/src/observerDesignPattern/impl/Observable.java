package observerDesignPattern.impl;

public interface Observable {

	void register(Observer obj);

	void deRegister(Observer obj);

	void notification();
	
	

}
