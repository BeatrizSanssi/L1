package app.src.main.resources;

import app.src.main.resources.Recipies.Recipe;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

/**
 * This class displays the ingredients menu and processes user input.
 */
public class IngredientsMenu {

    private final Scanner scanner;
    private final Recipies recipies;

    public IngredientsMenu(Scanner scanner, Recipies recipies) {
        this.scanner = scanner;
        this.recipies = recipies;
    }

    public void displayIngredientsMenu() {
        // List of ingredients
        String[] ingredients = {"Flour", "Sugar", "Eggs", "Butter", "Baking Soda", "Milk", "Baking Powder", 
                                "Vanilla Extract", "Cocoa", "Chocolate Chips", "Salt", "Brown Sugar", 
                                "Powdered Sugar", "Honey", "Yogurt", "Cream Cheese", "Lemon Juice"};
        HashMap<String, Boolean> userIngredients = new HashMap<>();

        // Ask user if they have each ingredient and store the answers
        System.out.println("Please answer 'yes' or 'no' if you have the following ingredients:");
        for (String ingredient : ingredients) {
            System.out.println("Do you have " + ingredient + "? (yes/no): ");
            String answer = scanner.nextLine().trim().toLowerCase();

            // Store the answer in a HashMap (yes = true, no = false)
            userIngredients.put(ingredient, answer.equals("yes"));
        }

        // Display the selected ingredients
        System.out.println("\nYou have selected the following ingredients:");
        if (userIngredients.isEmpty()) {
            System.out.println("No ingredients selected.");
        } else {
            for (String ingredient : userIngredients.keySet()) {
                if (userIngredients.get(ingredient)) {
                    System.out.println("- " + ingredient);
                }
            }
        }

        // Suggest recipes based on the ingredients the user has
        System.out.println("\nBased on the ingredients you have, here are some recipes you can make:");
        ArrayList<Recipies.Recipe> availableRecipes = recipies.suggestRecipes(userIngredients);

        if (availableRecipes.isEmpty()) {
            System.out.println("Sorry, I couldn't find any recipes with the ingredients you have.");
        } else {
            for (Recipies.Recipe recipe : availableRecipes) {
                System.out.println("- " + recipe.name + ": " + recipe.url);
            }
        }
    }
}