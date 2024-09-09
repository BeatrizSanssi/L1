package app.resources;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

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
    public List<Recipe> suggestRecipes(Map<String, Boolean> userIngredients) {
        List<Recipe> recipes = new ArrayList<>();

        if (userIngredients.getOrDefault("Flour", false) && 
            userIngredients.getOrDefault("Sugar", false) && 
            userIngredients.getOrDefault("Eggs", false)) {
            recipes.add(new Recipe("Pancakes", "https://www.allrecipes.com/recipe/21014/good-old-fashioned-pancakes/"));
        }
        if (userIngredients.getOrDefault("Flour", false) && 
            userIngredients.getOrDefault("Sugar", false) && 
            userIngredients.getOrDefault("Eggs", false) &&
            userIngredients.getOrDefault("Chocolate Chips", false)) {
            recipes.add(new Recipe("Chocolate Chip Cookies", "https://joyfoodsunshine.com/the-most-amazing-chocolate-chip-cookies/#wprm-recipe-container-8678"));
        }
        // Add more recipe suggestions here...

        return recipes;
    }
}