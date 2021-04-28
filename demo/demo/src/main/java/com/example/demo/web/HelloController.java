package com.example.demo.web;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/greating")
public class HelloController {
    @RequestMapping(value = "/basic",method = RequestMethod.GET)
    public String sayHello(){
        return "<h1>hello</h1>";
    }

    @RequestMapping(value = "/proper",method = RequestMethod.GET)
    public String sayProperHello(){
        return "<h1>hello there, How are you?</h1>";
    }
    @RequestMapping(value = "/user_entry",method = RequestMethod.GET)
    public String userForm(){
        return "Aqui va un form";
    }
    @RequestMapping(value = "/user_greating",method = RequestMethod.GET)
    public String printUserGreating(@RequestParam String firstname,@RequestParam String lastname){
        return "helo there";
    }
    @RequestMapping(value = "/order{id}",method = RequestMethod.GET)
    public String getOrde(@PathVariable String id ){
        return "helo there";
    }
}
