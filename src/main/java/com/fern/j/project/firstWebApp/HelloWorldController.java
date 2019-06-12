package com.fern.j.project.firstWebApp;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

//mark the class as controller
@RestController
public class HelloWorldController {

    //specify route for this method
    @GetMapping("/")
    public String getHelloWorld(){
        return "Hello World!";
    }

    @GetMapping("/hello/{name}")
    public String getHelloToMe(@PathVariable String name){
        return "Hello " + name;
    }
}
