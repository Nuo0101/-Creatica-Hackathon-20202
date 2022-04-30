// JavaScript Document
let color = "https://images.unsplash.com/photo-1493612276216-ee3925520721?ixlib=rb-1.2.1&ixid=MnwxMjA3fDB8MHxzZWFyY2h8MXx8cmFuZG9tfGVufDB8fDB8fA%3D%3D&auto=format&fit=crop&w=1000&q=60"; //green

const img = document.getElementsByTagName("img");
for (let i = 0; i<img.length; i++){
    img[i].src = color;
}
