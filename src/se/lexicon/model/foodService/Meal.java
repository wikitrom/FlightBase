package se.lexicon.model.foodService;

import java.util.HashMap;
import java.util.Map;

public class Meal {
	private Map<String, Integer> eatable;

	public Meal() {
		eatable = new HashMap<>();
	}

	public void displayMeal() {
		System.out.println();
		System.out.println("         Current meal selection");
		System.out.println("===========================================");
		eatable.forEach((k, v) -> System.out.println(k + " (price: " + v + " SEK]"));
		System.out.println("-------------------------------------------");
		System.out.println("The total price of your meal is: " + getTotalPrice() + " SEK");

	}

	public int getTotalPrice() {
		return eatable.entrySet().stream().mapToInt(Map.Entry::getValue).sum();
	}

	public void addEatable(Map<String, Integer> item) {
		try {
			eatable.putAll(item);
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

	public void removeEatable(String itemName) {
		try {
			eatable.entrySet().removeIf(entry -> entry.getKey().equalsIgnoreCase(itemName));
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
	
	public  Map<String, Integer>  getMeal() {
		return eatable;
	}

}
