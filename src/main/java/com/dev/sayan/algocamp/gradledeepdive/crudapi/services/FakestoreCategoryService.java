package com.dev.sayan.algocamp.gradledeepdive.crudapi.services;

import com.dev.sayan.algocamp.gradledeepdive.crudapi.dto.CategoryDto;
import com.dev.sayan.algocamp.gradledeepdive.crudapi.gateway.ICategoryGateway;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.util.List;

@Service
@RequiredArgsConstructor
public class FakestoreCategoryService implements ICategoryService {

    private final ICategoryGateway iCategoryGateway;
    @Override
    public List<CategoryDto> getAllCategory() throws IOException {
        return this.iCategoryGateway.getAllCategory();
    }
}
