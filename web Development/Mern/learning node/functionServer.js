const http = require('http');

function dataControll(req,resp){
    resp.write("<h1>Hello Rojalin</h1>");
    resp.end();


}
http.createServer(dataControll).listen(4501);