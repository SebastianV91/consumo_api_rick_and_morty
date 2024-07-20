package com.api.rickmorty.application.usecases;

import com.api.rickmorty.domain.ports.in.GetAdditionalCharacterInfoUseCase;
import com.api.rickmorty.domain.ports.out.ExternalServicePort;
import com.api.rickmorty.infrastructure.dto.CharacterDTO;

public class GetAdditionalCharacterInfoUseCaseImpl implements GetAdditionalCharacterInfoUseCase {

    private final ExternalServicePort externalServicePort;

    public GetAdditionalCharacterInfoUseCaseImpl(ExternalServicePort externalServicePort) {
        this.externalServicePort = externalServicePort;
    }

    @Override
    public CharacterDTO getAdditionalCharacterInfo() {
        return externalServicePort.getAdditionalCharacterInfo();
    }
}
