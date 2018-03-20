package se.lexicon.model.foodService;

import java.util.Map;

public interface  Menu
{
	public void displayMenu();
	public Map<String , Integer > getFoodOrDrink(String name);

	
}
