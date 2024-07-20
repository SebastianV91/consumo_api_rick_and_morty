package com.api.rickmorty.infrastructure.dto;

import lombok.Data;

@Data
public class ResultCharacterDTO {

    private Integer id;
    private String name;
    private String status;
    private String species;
    private String type;
    private String gender;

}
