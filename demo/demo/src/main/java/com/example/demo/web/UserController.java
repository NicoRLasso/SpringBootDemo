package com.example.demo.web;

import java.util.Arrays;
import java.util.Date;
import java.util.List;

import com.example.demo.domain.Product;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController {

    @RequestMapping("/{userid}")
    public String displayUser(@PathVariable int userid){
        return "user Found " + userid ;
    }

    @RequestMapping("/{userid}/invoices")
    public String displayUserInvoice(@PathVariable int userid ,
     @RequestParam(value = "d",required = false) Date dateOrNull)
     {
        return "Invoice Found for user:" + userid +" on "+dateOrNull;
    }

    @RequestMapping("/{userid}/items")
    public List<String> displaystringJson(@PathVariable int userid){
        return Arrays.asList("shoes","laptop","button");
    }

    @RequestMapping("/{userid}/products_as_json")
    public List<Product> displayProductsJson(@PathVariable int userid){
        return Arrays.asList(
            new Product(1,"shoes",42.99),
            new Product(2,"books",12.99),
            new Product(3,"bag" ,45.99));
    }
}
