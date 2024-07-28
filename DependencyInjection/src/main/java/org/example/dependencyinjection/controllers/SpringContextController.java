package org.example.dependencyinjection.controllers;

import org.springframework.stereotype.Controller;

@Controller
public class SpringContextController {

    public String sayHello() {

        System.out.println("Inside SpringContextController: sayHello");
        return "Hello World";
    }
}
