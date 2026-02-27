package com.dev.sayan.algocamp.gradledeepdive.crudapi.gateway;

import com.dev.sayan.algocamp.gradledeepdive.crudapi.dto.CategoryDto;
import com.dev.sayan.algocamp.gradledeepdive.crudapi.dto.FakeStoreCategoryResponseDto;
import com.dev.sayan.algocamp.gradledeepdive.crudapi.gateway.api.FakeStoreCategoryApi;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.io.IOException;
import java.util.List;

@Component
@RequiredArgsConstructor
public class FakeStoreCategoryGateway implements ICategoryGateway{

    private final FakeStoreCategoryApi fakeStoreCategoryApi ;
    @Override
    public List<CategoryDto> getAllCategory() throws IOException {
        List<String> response = this.fakeStoreCategoryApi.getAllFakeCategories().execute().body();
        if (response == null) {
            throw new IOException("Cannot fetch categories");
        }
        return response.stream()
                .map(category -> CategoryDto.builder().name(category).build())
                .toList();
    }
}
