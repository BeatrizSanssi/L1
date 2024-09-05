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
      return recipes;
  }
}
