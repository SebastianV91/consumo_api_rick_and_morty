package com.api.rickmorty.infrastructure.dto;

import lombok.Data;

import java.util.List;

@Data
public class CharacterDTO {

    InfoDTO info;
    List<ResultCharacterDTO> results;

}
