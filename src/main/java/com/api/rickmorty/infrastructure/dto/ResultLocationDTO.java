package com.api.rickmorty.infrastructure.dto;

import lombok.Data;

@Data
public class ResultLocationDTO {
    private Integer id;
    private String name;
    private String type;
    private String dimension;
}
