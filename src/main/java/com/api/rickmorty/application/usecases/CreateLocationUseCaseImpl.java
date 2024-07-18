package com.api.rickmorty.application.usecases;

import com.api.rickmorty.domain.model.Location;
import com.api.rickmorty.domain.ports.in.CreateLocationUseCase;
import com.api.rickmorty.domain.ports.out.LocationRepositoryPort;

public class CreateLocationUseCaseImpl implements CreateLocationUseCase {

    private final LocationRepositoryPort locationRepositoryPort;

    public CreateLocationUseCaseImpl(LocationRepositoryPort locationRepositoryPort) {
        this.locationRepositoryPort = locationRepositoryPort;
    }

    @Override
    public Location createLocation(Location location) {
        return locationRepositoryPort.save(location);
    }
}
