// Fetch ingredients from the Java backend
fetch('http://localhost:8080/api/ingredients')
    .then(response => response.json())
    .then(data => {
        const ingredientsList = document.getElementById('ingredients-list');
        ingredientsList.innerHTML = '';
        data.forEach(ingredient => {
            ingredientsList.innerHTML += `
                <label>
                    <input type="checkbox" value="${ingredient}"> ${ingredient}
                </label><br>
            `;
        });
    });

// Fetch recipes based on selected ingredients
function getRecipes() {
    const selectedIngredients = [];
    document.querySelectorAll('#ingredients-list input:checked').forEach(checkbox => {
        selectedIngredients.push(checkbox.value);
    });

    fetch('http://localhost:8080/api/recipes', {
        method: 'POST',
        headers: {
            'Content-Type': 'application/json'
        },
        body: JSON.stringify(selectedIngredients)
    })
    .then(response => response.json())
    .then(recipes => {
        const recipesList = document.getElementById('recipes-list');
        recipesList.innerHTML = '';
        recipes.forEach(recipe => {
            recipesList.innerHTML += `<li><a href="${recipe.url}">${recipe.name}</a></li>`;
        });
    });
}
// Serve static files from the 'public' directory
app.use(express.static('public'));

document.querySelector('#get-recipes-btn').addEventListener('click', getRecipes);