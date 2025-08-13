package decoraterDesignPattern.impl;

public class MushroomToppings extends DecoraterClass {

	BasePizza basePizza;

	public MushroomToppings(BasePizza basePizza) {
		this.basePizza = basePizza;
	}

	@Override
	int cost() {
		return this.basePizza.cost()+10;
	}

}
