package com.bilgeadam.Java5SpringDemo.controller;
/*
    Buray� bir controller compenenti yapal�m

    //end point
    bir metot olsun bu metot bize string birdeger donsun
    bunuda url cag�ral�m
    2. metodumuzda bize isim listesi donsun

 */

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/demo")
public class DemoController {

    @GetMapping("/getname")
    public String getName(){
        return "<style>.name{color:red;}</style>" +
                "<div class='name'>Mustafa</div>";
    }
    @GetMapping("/getlist")
    public String[] getNameList(){
        String [] arr={"Mustafa","Merve","Mert"};
        return  arr;
    }
    @GetMapping("/getname2")
    public String getName2(String name){
        return name;
    }



}
