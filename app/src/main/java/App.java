package app.src.main.java;

import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import app.src.main.java.app.main.GoodDay;
import app.src.main.java.resources.IngredientsMenu;
import app.src.main.java.resources.Recipies;
import app.src.main.java.resources.Recipies.Recipe;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;
import java.util.Map;
import java.util.HashMap;

@RestController
@RequestMapping("/api")
public class App {

    // API to return a greeting message
    @GetMapping("/greet")
    public String greetUser(@RequestParam String name) {
        GoodDay goodDay = new GoodDay();
        return goodDay.goodDay(name);
    }

    // API to return the list of ingredients
    @GetMapping("/ingredients")
    public List<String> getIngredients() {
        IngredientsMenu ingredientsMenu = new IngredientsMenu();
        return ingredientsMenu.getIngredients();
    }

    // API to suggest recipes based on selected ingredients
    @PostMapping("/recipes")
    public List<Recipe> suggestRecipes(@RequestBody List<String> ingredients) {
        Recipies recipies = new Recipies();
        Map<String, Boolean> userIngredients = new HashMap<>();
        
        for (String ingredient : ingredients) {
            userIngredients.put(ingredient, true);
        }
        
        return recipies.suggestRecipes(userIngredients);
    }
}