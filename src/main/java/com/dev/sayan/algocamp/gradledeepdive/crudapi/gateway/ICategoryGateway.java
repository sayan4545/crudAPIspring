package com.dev.sayan.algocamp.gradledeepdive.crudapi.gateway;

import com.dev.sayan.algocamp.gradledeepdive.crudapi.dto.CategoryDto;
import org.springframework.stereotype.Component;


public interface ICategoryGateway {

    CategoryDto getAllCategory();
}
