package decoraterDesignPattern.impl;

public class JalapeenoToppings extends DecoraterClass {

	BasePizza basePizza;

	public JalapeenoToppings(BasePizza basePizza) {
		this.basePizza = basePizza;
	}

	@Override
	int cost() {
		// TODO Auto-generated method stub
		return this.basePizza.cost()+25;
	}

}
