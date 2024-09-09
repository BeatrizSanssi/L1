package app.src.main.controller;

import app.src.main.resources.IngredientsMenu;
import app.src.main.resources.Recipies;
import app.src.main.resources.Recipies.Recipe;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;

@RestController
@RequestMapping("/api")
public class IngredientsController {

    // Endpoint to get the list of ingredients
    @GetMapping("/ingredients")
    public List<String> getIngredients() {
        IngredientsMenu ingredientsMenu = new IngredientsMenu();
        return ingredientsMenu.getIngredients();
    }

    // Endpoint to suggest recipes based on selected ingredients
    @PostMapping("/recipes")
    public List<Recipe> suggestRecipes(@RequestBody List<String> ingredients) {
        HashMap<String, Boolean> userIngredients = new HashMap<>();
        for (String ingredient : ingredients) {
            userIngredients.put(ingredient, true);  // Mark each selected ingredient as true
        }

        Recipies recipies = new Recipies();
        return recipies.suggestRecipes(userIngredients);
    }
}