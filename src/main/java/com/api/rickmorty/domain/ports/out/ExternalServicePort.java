package com.api.rickmorty.domain.ports.out;

import com.api.rickmorty.infrastructure.dto.LocationDTO;

public interface ExternalServicePort {
    LocationDTO getAdditionalLocationInfo();
}
