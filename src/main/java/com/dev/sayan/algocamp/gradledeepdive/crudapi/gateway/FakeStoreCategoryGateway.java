package com.dev.sayan.algocamp.gradledeepdive.crudapi.gateway;

import com.dev.sayan.algocamp.gradledeepdive.crudapi.dto.CategoryDto;
import org.springframework.stereotype.Component;

@Component
public class FakeStoreCategoryGateway implements ICategoryGateway{
    @Override
    public CategoryDto getAllCategory() {
        return null;
    }
}
