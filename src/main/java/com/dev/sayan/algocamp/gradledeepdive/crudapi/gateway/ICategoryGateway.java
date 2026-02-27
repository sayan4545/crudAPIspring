package com.dev.sayan.algocamp.gradledeepdive.crudapi.gateway;

import com.dev.sayan.algocamp.gradledeepdive.crudapi.dto.CategoryDto;
import org.springframework.stereotype.Component;

import java.io.IOException;
import java.util.List;


public interface ICategoryGateway {

    List<CategoryDto> getAllCategory() throws IOException;
}
