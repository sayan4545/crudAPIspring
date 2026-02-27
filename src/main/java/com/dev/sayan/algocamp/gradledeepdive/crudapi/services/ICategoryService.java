package com.dev.sayan.algocamp.gradledeepdive.crudapi.services;

import com.dev.sayan.algocamp.gradledeepdive.crudapi.dto.CategoryDto;

import java.io.IOException;
import java.util.List;

public interface ICategoryService {
    List<CategoryDto> getAllCategory() throws IOException;
}
