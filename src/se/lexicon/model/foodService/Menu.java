package se.lexicon.model.foodService;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

abstract public class Menu {

	protected Map<String, Integer> drinks;
	protected Map<String, Integer> foods;

	public Menu() {
		drinks = new HashMap<>();
		foods = new HashMap<>();
	}

	public abstract void displayMenu(); // implemented by sub-classes


	public Map<String, Integer> getFoodOrDrink(String name) {

		// temp variable
		Map<String, Integer> eatable = new HashMap<>();

		// easer to operate on one single map
		eatable.putAll(drinks);
		eatable.putAll(foods);

		Map<String, Integer> eatableToReturn;
		eatableToReturn = eatable.entrySet().stream()
				.filter(entry -> entry.getKey().toLowerCase().matches(".*" + name.trim().toLowerCase() + ".*"))
				.collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));

		return eatableToReturn;
	}

	public void displayDrinkMenu() {
		System.out.println();
		System.out.println("Available drinks:");

		drinks.forEach((k, v) -> System.out.println(k + " (price: " + v + " SEK]"));
	}

	public void displayFoodMenu() {
		System.out.println();
		System.out.println("Available food:");

		for (Map.Entry<String, Integer> pair : foods.entrySet()) {
			System.out.println(pair.getKey() + " [price: " + pair.getValue() + " SEK]");
		}

	}
}
