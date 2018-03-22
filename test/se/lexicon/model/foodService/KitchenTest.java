package se.lexicon.model.foodService;

import java.util.Map;

import org.junit.Test;

import se.lexicon.model.TicketType;

public class KitchenTest {

	Kitchen kitchen = new Kitchen();
	Menu eMenu = new EconomyMenu();
	Menu bMenu = new BusinessMenu();
	Meal meal;
	Map<String, Integer> mealEntries;


	@Test
	public void KitschenEconomyTest() {

		meal = kitchen.cookMeal(TicketType.ECONOMY);
		System.out.println();
		System.out.println("KitschenEconomyTest: get and print meal returned by kitchen");
		meal.getMeal().forEach((k, v) -> System.out.println(k + " (price: " + v + " SEK]"));

	}

}
