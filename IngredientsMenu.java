import java.util.Scanner;
import java.util.ArrayList;
import java.util.HashMap;

public class IngredientsMenu {

    public static void main(String[] args) {
        // Create a scanner to read user input
        Scanner scanner = new Scanner(System.in);

        // List of ingredients
        String[] ingredients = {"Flour", "Sugar", "Eggs", "Butter", "Milk", "Baking Powder", "Vanilla Extract"
        , "Cocoa", "Chocolate Chips", "Salt", "Brown Sugar", "Honey", "Yogurt", "Cream Cheese", "Lemon Juice"};
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
            for (String selected : userIngredients) {
                System.out.println("- " + selected);
            }
        }

        // Close the scanner
        scanner.close();
    }
}