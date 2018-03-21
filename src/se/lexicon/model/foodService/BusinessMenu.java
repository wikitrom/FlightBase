package se.lexicon.model.foodService;

public class BusinessMenu extends Menu {

	public BusinessMenu() {
		super();
		drinks.put("Coffee", 10);
		drinks.put("Tee", 10);
		drinks.put("Beer", 80);
		drinks.put("Wine", 80);
		drinks.put("Water", 2);

		foods.put("Hamburger", 140);
		foods.put("Chips", 23);
		foods.put("Salmon", 160);

	}
}
