package com.api.rickmorty.infrastructure.config;

import com.api.rickmorty.application.services.LocationService;
import com.api.rickmorty.application.usecases.*;
import com.api.rickmorty.domain.ports.in.GetAdditionalLocationInfoUseCase;
import com.api.rickmorty.domain.ports.out.ExternalServicePort;
import com.api.rickmorty.domain.ports.out.LocationRepositoryPort;
import com.api.rickmorty.infrastructure.adapters.ExternalServiceAdapter;
import com.api.rickmorty.infrastructure.repositories.LocationRepositoryAdapter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ApplicationConfig {

    @Bean
    public LocationService locationService(LocationRepositoryPort locationRepositoryPort, GetAdditionalLocationInfoUseCase getAdditionalLocationInfoUseCase){
        return new LocationService(
                new CreateLocationUseCaseImpl(locationRepositoryPort),
                new RetrieveLocationUseCaseImpl(locationRepositoryPort),
                new UpdateLocationUseCaseImpl(locationRepositoryPort),
                new DeleteLocationUseCaseImpl(locationRepositoryPort),
                getAdditionalLocationInfoUseCase
        );
    }

    @Bean
    public LocationRepositoryPort locationRepositoryPort(LocationRepositoryAdapter locationRepositoryAdapter){
        return locationRepositoryAdapter;
    }

    @Bean
    public GetAdditionalLocationInfoUseCase getAdditionalLocationInfoUseCase(ExternalServicePort externalServicePort){
        return new GetAdditionalLocationInfoUseCaseImpl(externalServicePort);
    }

    @Bean
    public ExternalServicePort externalServicePort(){
        return new ExternalServiceAdapter();
    }

}
