package com.example.demo.web;

import com.example.demo.domain.User;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class HomeController {
    @RequestMapping(value = "/")
    public String home(Model model){
        model.addAttribute("formData", new User());
        return "index";
    }

    @RequestMapping(value = "/crete" , method = RequestMethod.POST)
    public String processFormData(){
         
        return "index";
    }
}
