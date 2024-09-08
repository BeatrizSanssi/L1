package app.src.main;
import java.util.ArrayList;
import java.util.HashMap;

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
  public static ArrayList<Recipe> suggestRecipes(HashMap<String, Boolean> userIngredients) {
    ArrayList<Recipe> recipes = new ArrayList<>();

    // Recipe suggestions based on available ingredients
    if (userIngredients.get("Flour") && userIngredients.get("Sugar") && userIngredients.get("Eggs")&& userIngredients.get("Baking Powder")
    && userIngredients.get("Milk") && userIngredients.get("Butter") && userIngredients.get("Salt")) {
        recipes.add(new Recipe("Pancakes", "https://www.allrecipes.com/recipe/21014/good-old-fashioned-pancakes/"));
      };
    if (userIngredients.get("Flour") && userIngredients.get("Sugar") && userIngredients.get("Eggs")&& userIngredients.get("Baking Powder")
    && userIngredients.get("Milk") && userIngredients.get("Butter") && userIngredients.get("Vanilla Extract") && userIngredients.get("Chocolate Chips")
    && userIngredients.get("Brown Sugar") && userIngredients.get("Salt")) {
        recipes.add(new Recipe("Chocolate Chip Cookies", "https://joyfoodsunshine.com/the-most-amazing-chocolate-chip-cookies/#wprm-recipe-container-8678"));
      };
    if (userIngredients.get("Flour") && userIngredients.get("Sugar") && userIngredients.get("Eggs")&& userIngredients.get("Baking Powder")
    && userIngredients.get("Cocoa") && userIngredients.get("Butter") && userIngredients.get("Vanilla Extract") && userIngredients.get("Salt")
    && userIngredients.get("Powdered Sugar")) {
        recipes.add(new Recipe("Brownies", "https://tasty.co/recipe/swedish-sticky-chocolate-cake-kladdkaka"));
      };

      return recipes;
  }
}
