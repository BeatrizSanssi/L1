package app.src.main.resources;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * This class contains the recipe suggestion logic.
 */
public class Recipies {

    // Class to hold recipe information
    public static class Recipe {
        public String name;
        public String url;

        public Recipe(String name, String url) {
            this.name = name;
            this.url = url;
        }
    }

    // Function to suggest recipes based on the ingredients the user has
    public ArrayList<Recipe> suggestRecipes(HashMap<String, Boolean> userIngredients) {
        ArrayList<Recipe> recipes = new ArrayList<>();

        // Recipe suggestions based on available ingredients
        if (userIngredients.getOrDefault("Flour", false) && userIngredients.getOrDefault("Sugar", false) 
            && userIngredients.getOrDefault("Eggs", false) && userIngredients.getOrDefault("Baking Powder", false)
            && userIngredients.getOrDefault("Milk", false) && userIngredients.getOrDefault("Butter", false) 
            && userIngredients.getOrDefault("Salt", false)) {
            recipes.add(new Recipe("Pancakes", "https://www.allrecipes.com/recipe/21014/good-old-fashioned-pancakes/"));
        }
        if (userIngredients.getOrDefault("Flour", false) && userIngredients.getOrDefault("Sugar", false) 
            && userIngredients.getOrDefault("Eggs", false) && userIngredients.getOrDefault("Baking Powder", false)
            && userIngredients.getOrDefault("Milk", false) && userIngredients.getOrDefault("Butter", false) 
            && userIngredients.getOrDefault("Vanilla Extract", false) && userIngredients.getOrDefault("Chocolate Chips", false)
            && userIngredients.getOrDefault("Brown Sugar", false) && userIngredients.getOrDefault("Salt", false)) {
            recipes.add(new Recipe("Chocolate Chip Cookies", "https://joyfoodsunshine.com/the-most-amazing-chocolate-chip-cookies/#wprm-recipe-container-8678"));
        }
        if (userIngredients.getOrDefault("Flour", false) && userIngredients.getOrDefault("Sugar", false) 
            && userIngredients.getOrDefault("Eggs", false) && userIngredients.getOrDefault("Baking Powder", false)
            && userIngredients.getOrDefault("Cocoa", false) && userIngredients.getOrDefault("Butter", false) 
            && userIngredients.getOrDefault("Vanilla Extract", false) && userIngredients.getOrDefault("Salt", false)
            && userIngredients.getOrDefault("Powdered Sugar", false)) {
            recipes.add(new Recipe("Brownies", "https://tasty.co/recipe/swedish-sticky-chocolate-cake-kladdkaka"));
        }

        return recipes;
    }
}