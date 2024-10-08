package app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.*;

import app.resources.IngredientsMenu;
import app.resources.Recipies;
import app.resources.Recipies.Recipe;

import java.util.List;
import java.util.Map;
import java.util.HashMap;

@SpringBootApplication
@RestController
@RequestMapping("/api")
public class App {

    public static void main(String[] args) {
        SpringApplication.run(App.class, args);
    }

    // API to return a greeting message
    @GetMapping("/greet")
    public Map<String, String> greetUser(@RequestParam String name) {
        Map<String, String> response = new HashMap<>();
        response.put("greeting", "Hello, " + name + "!");  // Adjust message to your desired format
        return response;
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