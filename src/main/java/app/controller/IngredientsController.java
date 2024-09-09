// package app.controller;

// import org.springframework.web.bind.annotation.*;
// import java.util.List;
// import java.util.HashMap;
// import app.resources.IngredientsMenu;
// import app.resources.Recipies;
// import app.resources.Recipies.Recipe;

// @CrossOrigin(origins = "http://localhost:3000")  // Enable CORS for this controller
// @RestController
// @RequestMapping("/api")
// public class IngredientsController {

//     @GetMapping("/ingredients")
//     public List<String> getIngredients() {
//         IngredientsMenu ingredientsMenu = new IngredientsMenu();
//         return ingredientsMenu.getIngredients();
//     }

//     @PostMapping("/recipes")
//     public List<Recipe> suggestRecipes(@RequestBody List<String> ingredients) {
//         HashMap<String, Boolean> userIngredients = new HashMap<>();
//         for (String ingredient : ingredients) {
//             userIngredients.put(ingredient, true);
//         }

//         Recipies recipies = new Recipies();
//         return recipies.suggestRecipes(userIngredients);
//     }
// }