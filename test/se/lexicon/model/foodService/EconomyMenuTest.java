package se.lexicon.model.foodService;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import java.util.HashMap;
import java.util.Map;

import org.junit.Before;
import org.junit.Test;

public class EconomyMenuTest {

	Menu eMenu = new EconomyMenu();
	Menu bMenu = new BusinessMenu();

	@Before
	public void setUp() throws Exception {
		
	}

	@Test
	public void getCoffeeTest() {
		Map<String, Integer> foodItem;
		int coffeePrice = 0;

		foodItem = eMenu.getFoodOrDrink("coffee");
		coffeePrice = foodItem.entrySet().stream().mapToInt(Map.Entry::getValue).sum();
		assertEquals(10, coffeePrice);
	}

}
