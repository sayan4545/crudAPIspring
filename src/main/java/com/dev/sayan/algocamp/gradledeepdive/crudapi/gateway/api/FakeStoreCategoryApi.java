package com.dev.sayan.algocamp.gradledeepdive.crudapi.gateway.api;

import com.dev.sayan.algocamp.gradledeepdive.crudapi.dto.FakeStoreCategoryResponseDto;
import retrofit2.Call;
import retrofit2.http.GET;

public interface FakeStoreCategoryApi {

    @GET("/products/category")
    Call<FakeStoreCategoryResponseDto> getAllFakeCategories();
}
