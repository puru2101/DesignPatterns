package decoraterDesignPattern.impl;

public class MainClass {

	public static void main(String[] args) {

		BasePizza basePizza = new MushroomToppings(new JalapeenoToppings(new VeggeDelitePizza()));
		System.out.println(basePizza.cost());
		
	}

}
