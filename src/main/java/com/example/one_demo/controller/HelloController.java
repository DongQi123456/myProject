package com.example.one_demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @RequestMapping("/")
    public String hello(){
        return "hello dongqi!";
    }

    @RequestMapping("/name")
    public String hello(@RequestParam String name){
        return "Hello" + name;
    }

    @RequestMapping("/nameAndAge")
    public String hello(@RequestParam String name,
                        @RequestParam Integer age){
        return "Hello," + name + ".my age is " + age;
    }


}
