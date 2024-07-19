package com.api.rickmorty.application.usecases;

import com.api.rickmorty.domain.ports.in.GetAdditionalLocationInfoUseCase;
import com.api.rickmorty.domain.ports.out.ExternalServicePort;
import com.api.rickmorty.infrastructure.dto.LocationDTO;

public class GetAdditionalLocationInfoUseCaseImpl implements GetAdditionalLocationInfoUseCase {

    private final ExternalServicePort externalServicePort;

    public GetAdditionalLocationInfoUseCaseImpl(ExternalServicePort externalServicePort) {
        this.externalServicePort = externalServicePort;
    }

    @Override
    public LocationDTO getAdditionalLocationInfo() {
        return externalServicePort.getAdditionalLocationInfo();
    }

}
