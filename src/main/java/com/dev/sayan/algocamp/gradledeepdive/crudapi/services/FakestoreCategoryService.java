package com.dev.sayan.algocamp.gradledeepdive.crudapi.services;

import com.dev.sayan.algocamp.gradledeepdive.crudapi.gateway.ICategoryGateway;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class FakestoreCategoryService implements ICategoryService {

    private final ICategoryGateway iCategoryGateway;
    @Override
    public List<String> getAllCategory() {
        return List.of();
    }
}
