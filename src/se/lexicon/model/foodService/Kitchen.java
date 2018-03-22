package se.lexicon.model.foodService;

import java.util.Map;
import java.util.Scanner;

import se.lexicon.model.TicketType;

public class Kitchen {

	public Kitchen() {

	}

	public Meal cookMeal(TicketType ticketType) {

		Menu menu;
		Meal meal = new Meal();
		String input;
		boolean notDone = true;
		Map<String, Integer> eatableItem;

		// decide what menu applies
		if (ticketType.equals(TicketType.BUSINESS)) {
			menu = new BusinessMenu();
		} else {
			menu = new EconomyMenu();
		}

		menu.displayMenu();
		System.out.println();

		// TODO: This is soooo ugly! :-(
		do {
			input = askForAString(
					"Enter the name of any item you want to buy\nEnter 'done' when satisfied, 'meal' to show your current selection and 'menu' to show the Menu.");

			if (!(input.isEmpty())) {

				if (input.trim().toLowerCase().equals("done")) { // we are done
					notDone = false;
					System.out.println("Exiting meal selection.");
					break;
				}

				if (input.trim().toLowerCase().matches(".*meal.*")) { // show current selectiona
					meal.displayMeal();

				} else if (input.trim().toLowerCase().matches(".*menu.*")) { // show menu
					menu.displayMenu();

				} else {
					eatableItem = menu.getFoodOrDrink(input);
					meal.addEatable(eatableItem);
				}
			}
		} while (notDone);

		return meal;
	}

	/**
	 * Helper function that reads a string from stdin and returns it to caller.
	 *
	 * @param displayText
	 *            Text to display on stdout
	 * @return String
	 */
	private String askForAString(String displayText) {

		Scanner sc = new Scanner(System.in).useDelimiter("\n"); // closed in main
		String input;

		System.out.println(displayText);

		input = sc.next().trim();

		return input;
	}

}
