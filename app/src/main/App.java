package app.src.main;

import app.src.main.resources.IngredientsMenu;
import app.src.main.resources.Recipies;
import app.src.main.GoodDay;
import java.util.Scanner;

/**
 * This is the main class for the Greeting and Recipe App.
 */
public class App {

    /**
     * The App starting point.
     *
     * @param args Unused program arguments.
     */
    public static void main(String[] args) {
        // Scanner for user input
        Scanner scanner = new Scanner(System.in, "UTF-8");

        // Greeting the user
        GoodDay goodDay = new GoodDay();
        System.out.println("Please enter your name:");
        String name = scanner.nextLine();
        System.out.println(goodDay.goodDay(name));

        // Display the ingredients menu
        IngredientsMenu ingredientsMenu = new IngredientsMenu(scanner, new Recipies());
        ingredientsMenu.displayIngredientsMenu();

        // Close the scanner
        scanner.close();
    }
}