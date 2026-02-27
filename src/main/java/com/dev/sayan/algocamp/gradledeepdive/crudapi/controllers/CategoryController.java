package com.dev.sayan.algocamp.gradledeepdive.crudapi.controllers;

import com.dev.sayan.algocamp.gradledeepdive.crudapi.dto.CategoryDto;
import com.dev.sayan.algocamp.gradledeepdive.crudapi.dto.FakeStoreCategoryResponseDto;
import com.dev.sayan.algocamp.gradledeepdive.crudapi.services.ICategoryService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;
import java.util.List;

@RestController
@RequestMapping ("/api/v1/controllers")
@AllArgsConstructor
public class CategoryController {

    private final ICategoryService iCategoryService;

    // constructor injection
//    public CategoryController(ICategoryService iCategoryService){
//        this.iCategoryService = iCategoryService;
//    }
    @GetMapping
    public List<CategoryDto> getAllCategories() throws IOException {
        return this.iCategoryService.getAllCategory();
    }


}
