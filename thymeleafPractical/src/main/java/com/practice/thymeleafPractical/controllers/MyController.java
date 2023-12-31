package com.practice.thymeleafPractical.controllers;
 
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.Date;
import java.util.List;

@Controller
public class MyController {

    @RequestMapping(value = "/about",method = RequestMethod.GET)
    public String about(Model model)
    {
        System.out.println("Inside about handler....");

        //Putting data in model
        model.addAttribute("name","Ankit Pal");

        model.addAttribute("currentDate",new Date().toLocaleString());

        //example
        String nameString="abc";
        nameString.toUpperCase();
        return "about";
        //about.html
    }

    @GetMapping("/example-loop")
    public String iteraterHandler(Model m){
        //send

        //Creating a list , set collection
        List<String> names = List.of("Ankit", "Laxmi", "Karan", "John");
        m.addAttribute("names",names);


        return "iterate";
    }
}
