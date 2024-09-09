package app.controller;

import org.springframework.web.bind.annotation.*;

import app.resources.IngredientsMenu;
import app.resources.Recipies;
import app.resources.Recipies.Recipe;

import java.util.HashMap;
import java.util.List;

@RestController
@RequestMapping("/api")
public class IngredientsController {

    @GetMapping("/ingredient-list")
    public List<String> getIngredients() {
        IngredientsMenu ingredientsMenu = new IngredientsMenu();
        return ingredientsMenu.getIngredients();
    }


    // Endpoint to suggest recipes based on selected ingredients
    @PostMapping("/recipe-suggestions")
    public List<Recipe> suggestRecipes(@RequestBody List<String> ingredients) {
        HashMap<String, Boolean> userIngredients = new HashMap<>();
        for (String ingredient : ingredients) {
            userIngredients.put(ingredient, true);
        }

        Recipies recipies = new Recipies();
        return recipies.suggestRecipes(userIngredients);
    }
}