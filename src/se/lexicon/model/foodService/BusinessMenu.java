package se.lexicon.model.foodService;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class BusinessMenu implements Menu
{
	
	Map<String, Integer> foods = new HashMap<String, Integer>();
	Map<String, Integer> drinks = new HashMap<String, Integer>();

	public BusinessMenu(){
		foods.put("Lax", 140);
		foods.put("Hamburgare", 80);
		drinks.put("Cola", 30);
		drinks.put("Caffe", 30);
		
	}
	private void displayFoods()
	{
		for (String food : foods.keySet())
		{
			System.out.println(food);
		}
	}

	private void displayDrinks()
	{
		for (String drink : drinks.keySet())
		{
			System.out.println(drink);
		}

	}

	public void displayMenu()
	{
		displayFoods();
		displayDrinks();
	}

	@Override
	public Map<String, Integer> getFoodOrDrink(String name)
	{
		// temp variable
		Map<String, Integer> eatable = new HashMap<>();

		// easer to operate on one single map
		eatable.putAll(drinks);
		eatable.putAll(foods);

		Map<String, Integer> eatableToReturn;
		eatableToReturn = eatable.entrySet().stream().filter(entry -> entry.getKey().toLowerCase().matches(".*" + name.trim().toLowerCase() + ".*"))
				.collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));

		return eatableToReturn;
	}

	

}
