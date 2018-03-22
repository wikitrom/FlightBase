package se.lexicon.model.foodService;

import static org.junit.Assert.*;

import java.util.Map;

import org.junit.Test;

public class MealTest {

	Menu eMenu = new EconomyMenu();
	Menu bMenu = new BusinessMenu();
	Meal meal = new Meal();

	@Test
	public void mealAddEatableTest() {

		// temporary test case, should not print but verify map
		Map<String, Integer> foodItem;
		foodItem = eMenu.getFoodOrDrink("coffee");
		int coffeePrice = foodItem.entrySet().stream().mapToInt(Map.Entry::getValue).sum();

		System.out.println("mealAddEatablesTest - eMenu: price of coffee is: " + coffeePrice);

		meal.addEatable(foodItem);
		meal.displayMeal();

		// fail("Not yet implemented");
	}

	@Test
	public void mealGetTotalPriceBusinessMenuTest() {

		// preparation - add 2 items to meal
		Map<String, Integer> foodItem;
		int totalPrice = 0;

		foodItem = bMenu.getFoodOrDrink("coffee");
		meal.addEatable(foodItem);
		totalPrice += foodItem.entrySet().stream().mapToInt(Map.Entry::getValue).sum();

		foodItem = bMenu.getFoodOrDrink("salmon");
		meal.addEatable(foodItem);
		totalPrice += foodItem.entrySet().stream().mapToInt(Map.Entry::getValue).sum();

		// test
		assertEquals(totalPrice, meal.getTotalPrice());
	}

	@Test
	public void mealGetTotalPriceEconomyMenuTest() {

		// preparation - add 2 items to meal
		Map<String, Integer> foodItem;
		int totalPrice = 0;

		foodItem = eMenu.getFoodOrDrink("coffee");
		meal.addEatable(foodItem);
		totalPrice += foodItem.entrySet().stream().mapToInt(Map.Entry::getValue).sum();

		foodItem = eMenu.getFoodOrDrink("chips");
		meal.addEatable(foodItem);
		totalPrice += foodItem.entrySet().stream().mapToInt(Map.Entry::getValue).sum();

		// test
		assertEquals(totalPrice, meal.getTotalPrice());
	}

}
