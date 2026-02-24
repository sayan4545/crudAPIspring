package com.dev.sayan.algocamp.gradledeepdive.crudapi.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping ("/api/v1/controllers")
public class CategoryController {

    @GetMapping("/category")
    public String getCategory(){
        return "Electronics";
    }

    @GetMapping("/count")
    public int getCount(){
        return 9;
    }
}
