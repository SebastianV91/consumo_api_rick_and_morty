package com.api.rickmorty.application.usecases;

import com.api.rickmorty.domain.ports.in.DeleteLocationUseCase;
import com.api.rickmorty.domain.ports.out.LocationRepositoryPort;

public class DeleteLocationUseCaseImpl implements DeleteLocationUseCase {

    private final LocationRepositoryPort locationRepositoryPort;

    public DeleteLocationUseCaseImpl(LocationRepositoryPort locationRepositoryPort) {
        this.locationRepositoryPort = locationRepositoryPort;
    }

    @Override
    public boolean deleteLocation(Integer id) {
        return locationRepositoryPort.deleteById(id);
    }

}
