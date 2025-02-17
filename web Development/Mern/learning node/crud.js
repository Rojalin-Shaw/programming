const fs = require('fs');
const path = require('path');
const dirPath = path.join(__dirname,'file');
console.warn(dirPath)



// This is for creating multiple file in once
// for(i=0; i<5; i++)
// {
//     fs.writeFileSync(dirPath+ "/hello"+i+".html","<h1>Hello Rojalin<h1>");
// }
// const filePath ='${path}/apple.txt';
// fs.writeFileSync(filePath,'This is about what apple is and beniefits of apple');