package io.javabrains.springbootstarter.hello;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller_Hello {


    @RequestMapping("/hello")
    public String sayHi(){
        return "Hi";

    }
}
