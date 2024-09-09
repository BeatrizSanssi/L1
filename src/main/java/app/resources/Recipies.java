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
        if (userIngredients.getOrDefault("Flour", false) && 
            userIngredients.getOrDefault("Sugar", false) && 
            userIngredients.getOrDefault("Eggs", false) &&
            userIngredients.getOrDefault("Cocoa", false)) {
            recipes.add(new Recipe("Chocolate Cake", "https://www.allrecipes.com/recipe/17528/extreme-chocolate-cake/"));
        }
        if (userIngredients.getOrDefault("Flour", false) && 
            userIngredients.getOrDefault("Sugar", false) && 
            userIngredients.getOrDefault("Eggs", false) &&
            userIngredients.getOrDefault("Lemon Juice", false)) {
            recipes.add(new Recipe("Lemon Cake", "https://www.allrecipes.com/recipe/7399/lemon-pound-cake-i/"));
        }
        if (userIngredients.getOrDefault("Flour", false) && 
            userIngredients.getOrDefault("Sugar", false) && 
            userIngredients.getOrDefault("Eggs", false) &&
            userIngredients.getOrDefault("Yogurt", false)) {
            recipes.add(new Recipe("Yogurt Cake", "https://www.allrecipes.com/recipe/17678/yogurt-cake-i/"));
        }
        if (userIngredients.getOrDefault("Flour", false) && 
            userIngredients.getOrDefault("Sugar", false) && 
            userIngredients.getOrDefault("Eggs", false) &&
            userIngredients.getOrDefault("Honey", false)) {
            recipes.add(new Recipe("Honey Cake", "https://www.allrecipes.com/recipe/7399/lemon-pound-cake-i/"));
        }
        if (userIngredients.getOrDefault("Flour", false) && 
            userIngredients.getOrDefault("Sugar", false) && 
            userIngredients.getOrDefault("Eggs", false) &&
            userIngredients.getOrDefault("Cocoa", false) &&
            userIngredients.getOrDefault("Butter", false)) {
            recipes.add(new Recipe("Brownies", "https://www.allrecipes.com/recipe/10549/best-brownies/"));
        }
        if (userIngredients.getOrDefault("Flour", false) && 
            userIngredients.getOrDefault("Sugar", false) && 
            userIngredients.getOrDefault("Eggs", false) &&
            userIngredients.getOrDefault("Vanilla Extract", false)) {
            recipes.add(new Recipe("Vanilla Cake", "https://www.allrecipes.com/recipe/7475/simple-white-cake/"));
        }
        if (userIngredients.getOrDefault("Flour", false) && 
            userIngredients.getOrDefault("Sugar", false) && 
            userIngredients.getOrDefault("Eggs", false) &&
            userIngredients.getOrDefault("Baking Powder", false)) {
            recipes.add(new Recipe("Pound Cake", "https://www.allrecipes.com/recipe/7399/lemon-pound-cake-i/"));
        }
        if (userIngredients.getOrDefault("Sugar", false) && 
            userIngredients.getOrDefault("Eggs", false) &&
            userIngredients.getOrDefault("Vanilla Extract", false) &&
            userIngredients.getOrDefault("Salt", false)) {
            recipes.add(new Recipe("Meringues", "https://www.taste.com.au/recipes/basic-meringues-2/631f6019-107c-428b-b2c9-772a2b498ace"));
        }  

        return recipes;
    }
}