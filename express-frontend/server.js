const express = require('express');
const path = require('path');
const axios = require('axios');

const app = express();
const port = 3000;

// Serve static files (CSS, JS, etc.)
app.use(express.static('public'));

// Serve the frontend (index.html)
app.get('/', (req, res) => {
    res.sendFile(path.join(__dirname, 'public/index.html'));
});

app.listen(port, () => {
    console.log(`Express server running at http://localhost:${port}`);
});