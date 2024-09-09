package app.src.main.resources;

import java.util.Arrays;
import java.util.List;

public class IngredientsMenu {

    // Return a list of ingredients as JSON
    public List<String> getIngredients() {
        return Arrays.asList(
            "Flour", "Sugar", "Eggs", "Butter", "Baking Soda", "Milk", 
            "Baking Powder", "Vanilla Extract", "Cocoa", "Chocolate Chips", 
            "Salt", "Brown Sugar", "Powdered Sugar", "Honey", 
            "Yogurt", "Cream Cheese", "Lemon Juice"
        );
    }
}