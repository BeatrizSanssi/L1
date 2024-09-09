const express = require('express');
const axios = require('axios'); // To make requests to your Java backend
const path = require('path');
const cors = require('cors'); 

const app = express();
const port = 3000;

// Middleware to enable CORS
app.use(cors({ origin: 'http://localhost:8080/' })); 
// app.use(cors()); 

// Middleware to serve static files (e.g., HTML, CSS, JS)
app.use(express.static(path.join(__dirname, './public')));

// Middleware to parse JSON request bodies
app.use(express.json());

// Route to serve the main page
app.get('/', (req, res) => {
    res.sendFile(path.join(__dirname, './public', 'index.html'));
});

// Route to fetch greeting from the Java backend
app.get('/greet', async (req, res) => {
    const name = req.query.name;
    try {
        const response = await axios.get(`http://localhost:8080/api/greet?name=${name}`);
        res.json(response.data);
    } catch (error) {
        res.status(500).json({ message: 'Error fetching greeting' });
    }
});

// Route to fetch ingredients from the Java backend
app.get('/ingredients', async (req, res) => {
    try {
        const response = await axios.get('http://localhost:8080/api/ingredients');
        res.json(response.data);
    } catch (error) {
        res.status(500).json({ message: 'Error fetching ingredients' });
    }
});

// Route to fetch recipe suggestions from the Java backend
app.post('/recipes', async (req, res) => {
    const ingredients = req.body;
    try {
        const response = await axios.post('http://localhost:8080/api/recipes', ingredients);
        res.json(response.data);
    } catch (error) {
        res.status(500).json({ message: 'Error fetching recipes' });
    }
});

// Start the server
app.listen(port, () => {
    console.log(`Server running at http://localhost:${port}`);
});