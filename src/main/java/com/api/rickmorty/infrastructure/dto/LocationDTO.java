package com.api.rickmorty.infrastructure.dto;

import lombok.Data;

import java.util.List;

@Data
public class LocationDTO {

    InfoDTO info;
    List<ResultLocationDTO> results;

}
