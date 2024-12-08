let input = document.getElementById("screen");
let button = document.querySelectorAll('button');
let str = " ";
let arr = Array.from(button) || Array.from(input);
arr.forEach(function(button){
    button.addEventListener('click', ()=> {
        let a = button.innerHTML;
                
        if(a == '='){
            str = eval(str);
            input.value = str || eval(input.value);
            
        } else if(a == 'AC'){
            str = " ";
            input.value = str;
        }else if( a == 'DEL'){
            str = str.substring(0, str.length - 1);
            input.value = str;
        }else{
            str = str+a;
            input.value = str;
        }

        
        // str = button.innerHTML;
        // input.value = str;
        // alert(button.innerHTML);
    })
})
