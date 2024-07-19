package com.api.rickmorty.infrastructure.adapters;

import com.api.rickmorty.domain.ports.out.ExternalServicePort;
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

    @Override
    public LocationDTO getAdditionalLocationInfo() {

        httpHeaders.setAccept(List.of(MediaType.APPLICATION_JSON));

        HttpEntity<String> entity = new HttpEntity<>(httpHeaders);

        ResponseEntity<LocationDTO> response = restTemplate.exchange(locationApi, HttpMethod.GET,
                entity, LocationDTO.class);

        return response.getBody();
    }
}
