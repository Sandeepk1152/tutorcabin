package com.example.tutorcabin.Controllers;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

    @RequestMapping("/")
    public String home(){

        return "Home";
    }

    @RequestMapping("/result")
    public String result(){

        return "result";
    }

}
