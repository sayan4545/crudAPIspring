package com.dev.sayan.algocamp.gradledeepdive.crudapi.gateway.api;

import com.dev.sayan.algocamp.gradledeepdive.crudapi.dto.FakeStoreCategoryResponseDto;
import org.springframework.stereotype.Repository;
import retrofit2.Call;
import retrofit2.http.GET;
import java.io.IOException;
import java.util.List;

@Repository
public interface FakeStoreCategoryApi {

    @GET("products/categories")
    Call<List<String>> getAllFakeCategories() throws IOException;
}
