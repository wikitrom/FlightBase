package se.lexicon.model.foodService;

public class EconomyMenu extends Menu {

	public EconomyMenu() {
		super();
		drinks.put("Coffee", 10);
		drinks.put("Tee", 10);
		drinks.put("Beer", 80);
		drinks.put("Wine", 80);
		drinks.put("Water", 2);

		foods.put("Sandwich", 55);
		foods.put("Chips", 23);
		foods.put("Tomato soup", 54);

	}

	@Override
	public void displayMenu() {
		displayHeader();
		super.displayDrinkMenu();
		super.displayFoodMenu();
	}

	private void displayHeader() {
		System.out.println();
		System.out.println("          Economy Class Menu");
		System.out.println("======================================");
	}

}
