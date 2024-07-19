package com.api.rickmorty.domain.ports.in;

import com.api.rickmorty.infrastructure.dto.LocationDTO;

public interface GetAdditionalLocationInfoUseCase {

    LocationDTO getAdditionalLocationInfo();

}
