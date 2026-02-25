package com.dev.sayan.algocamp.gradledeepdive.crudapi.dto;

import lombok.*;

import java.util.List;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class FakeStoreCategoryResponseDto {

    private String message;
    private String status;
    private List<String> categories;
}
