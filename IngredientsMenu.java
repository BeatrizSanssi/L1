import java.util.Scanner;
import java.util.ArrayList;

public class IngredientsMenu {

    public static void main(String[] args) {
        // Create a scanner to read user input
        Scanner scanner = new Scanner(System.in);

        // List of ingredients
        String[] ingredients = {"Flour", "Sugar", "Eggs", "Butter", "Milk", "Baking Powder", "Vanilla Extract"
        , "Cocoa", "Chocolate Chips", "Salt", "Brown Sugar", "Honey", "Yogurt", "Cream Cheese", "Lemon Juice"};
        ArrayList<String> selectedIngredients = new ArrayList<>();

        // Loop through each ingredient and ask the user for yes/no input
        System.out.println("Please answer 'yes' or 'no' if you have the following ingredients:");

        for (String ingredient : ingredients) {
            System.out.println("Do you have " + ingredient + "? (yes/no): ");
            String answer = scanner.nextLine().trim().toLowerCase();

            // If the answer is "yes", add the ingredient to the selected list
            if (answer.equals("yes")) {
                selectedIngredients.add(ingredient);
            }
        }

        // Display the selected ingredients
        System.out.println("\nYou have selected the following ingredients:");
        if (selectedIngredients.isEmpty()) {
            System.out.println("No ingredients selected.");
        } else {
            for (String selected : selectedIngredients) {
                System.out.println("- " + selected);
            }
        }

        // Close the scanner
        scanner.close();
    }
}