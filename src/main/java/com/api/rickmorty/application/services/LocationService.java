package com.api.rickmorty.application.services;

import com.api.rickmorty.domain.model.Location;
import com.api.rickmorty.domain.ports.in.*;
import com.api.rickmorty.infrastructure.dto.LocationDTO;

import java.util.List;
import java.util.Optional;

public class LocationService implements CreateLocationUseCase, RetrieveLocationUseCase, UpdateLocationUseCase, DeleteLocationUseCase, GetAdditionalLocationInfoUseCase {

    private final CreateLocationUseCase createLocationUseCase;
    private final RetrieveLocationUseCase retrieveLocationUseCase;
    private final UpdateLocationUseCase updateLocationUseCase;
    private final DeleteLocationUseCase deleteLocationUseCase;
    private final GetAdditionalLocationInfoUseCase getAdditionalLocationInfoUseCase;

    public LocationService(CreateLocationUseCase createLocationUseCase, RetrieveLocationUseCase retrieveLocationUseCase,
                           UpdateLocationUseCase updateLocationUseCase, DeleteLocationUseCase deleteLocationUseCase,
                           GetAdditionalLocationInfoUseCase getAdditionalLocationInfoUseCase) {
        this.createLocationUseCase = createLocationUseCase;
        this.retrieveLocationUseCase = retrieveLocationUseCase;
        this.updateLocationUseCase = updateLocationUseCase;
        this.deleteLocationUseCase = deleteLocationUseCase;
        this.getAdditionalLocationInfoUseCase = getAdditionalLocationInfoUseCase;
    }

    @Override
    public Location createLocation(Location location) {
        return createLocationUseCase.createLocation(location);
    }

    @Override
    public boolean deleteLocation(Integer id) {
        return deleteLocationUseCase.deleteLocation(id);
    }

    @Override
    public Optional<Location> getLocationById(Integer id) {
        return retrieveLocationUseCase.getLocationById(id);
    }

    @Override
    public List<Location> getAllLocations() {
        return retrieveLocationUseCase.getAllLocations();
    }

    @Override
    public Optional<Location> updateLocation(Integer id, Location updateLocation) {
        return updateLocationUseCase.updateLocation(id, updateLocation);
    }

    @Override
    public LocationDTO getAdditionalLocationInfo() {
        return getAdditionalLocationInfoUseCase.getAdditionalLocationInfo();
    }
}
