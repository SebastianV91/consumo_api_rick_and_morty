package com.api.rickmorty.infrastructure.adapters;

import com.api.rickmorty.domain.ports.out.ExternalServicePort;
import com.api.rickmorty.infrastructure.dto.CharacterDTO;
import com.api.rickmorty.infrastructure.dto.LocationDTO;
import org.springframework.http.*;
import org.springframework.web.client.RestTemplate;

import java.util.List;

public class ExternalServiceAdapter implements ExternalServicePort {

    private final RestTemplate restTemplate;
    private final HttpHeaders httpHeaders;

    public ExternalServiceAdapter() {
        restTemplate = new RestTemplate();
        httpHeaders = new HttpHeaders();
    }

    private static String locationApi = "https://rickandmortyapi.com/api/location";
    private static String characterApi = "https://rickandmortyapi.com/api/character";

    @Override
    public LocationDTO getAdditionalLocationInfo() {

        httpHeaders.setAccept(List.of(MediaType.APPLICATION_JSON));

        HttpEntity<String> entity = new HttpEntity<>(httpHeaders);

        ResponseEntity<LocationDTO> response = restTemplate.exchange(locationApi, HttpMethod.GET,
                entity, LocationDTO.class);

        return response.getBody();
    }

    @Override
    public CharacterDTO getAdditionalCharacterInfo() {

        httpHeaders.setAccept(List.of(MediaType.APPLICATION_JSON));

        HttpEntity<String> entity = new HttpEntity<>(httpHeaders);

        ResponseEntity<CharacterDTO> response = restTemplate.exchange(characterApi, HttpMethod.GET,
                entity, CharacterDTO.class);

        return response.getBody();
    }


}
