package com.api.rickmorty.application.usecases;

import com.api.rickmorty.domain.model.Location;
import com.api.rickmorty.domain.ports.in.RetrieveLocationUseCase;
import com.api.rickmorty.domain.ports.out.LocationRepositoryPort;

import java.util.List;
import java.util.Optional;

public class RetrieveLocationUseCaseImpl implements RetrieveLocationUseCase {

    private final LocationRepositoryPort locationRepositoryPort;

    public RetrieveLocationUseCaseImpl(LocationRepositoryPort locationRepositoryPort) {
        this.locationRepositoryPort = locationRepositoryPort;
    }

    @Override
    public Optional<Location> getLocationById(Integer id) {
        return locationRepositoryPort.findById(id);
    }

    @Override
    public List<Location> getAllLocations() {
        return locationRepositoryPort.findAll();
    }
}
