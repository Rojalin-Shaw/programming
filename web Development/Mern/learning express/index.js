const express = require('express');
const app = express();
app.get('/', function(req, res) {
res.send('Welcome to my Express server!');
});
app.get('/about', function(req, res) {
    res.send("this is all About You");
});
app.get('/contact', function(req, res){
    res.send("Here You can contact us")
})

app.listen (5000, function(req, res){
    console.log('Server is running on port 5000');
});