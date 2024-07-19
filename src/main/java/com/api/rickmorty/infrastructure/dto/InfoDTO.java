package com.api.rickmorty.infrastructure.dto;

import lombok.Data;

@Data
public class InfoDTO {

    private Integer count;
    private Integer pages;
    private String next;
    private String prev;

}
