package com.api.rickmorty.application.usecases;

import com.api.rickmorty.domain.model.Location;
import com.api.rickmorty.domain.ports.in.UpdateLocationUseCase;
import com.api.rickmorty.domain.ports.out.LocationRepositoryPort;

import java.util.Optional;

public class UpdateLocationUseCaseImpl implements UpdateLocationUseCase {

    private final LocationRepositoryPort locationRepositoryPort;

    public UpdateLocationUseCaseImpl(LocationRepositoryPort locationRepositoryPort) {
        this.locationRepositoryPort = locationRepositoryPort;
    }

    @Override
    public Optional<Location> updateLocation(Integer id, Location updateLocation) {
        return locationRepositoryPort.update(updateLocation);
    }

}
