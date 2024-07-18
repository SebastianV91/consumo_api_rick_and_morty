package com.api.rickmorty.application.services;

import com.api.rickmorty.domain.model.Location;
import com.api.rickmorty.domain.ports.in.CreateLocationUseCase;
import com.api.rickmorty.domain.ports.in.DeleteLocationUseCase;
import com.api.rickmorty.domain.ports.in.RetrieveLocationUseCase;
import com.api.rickmorty.domain.ports.in.UpdateLocationUseCase;

import java.util.List;
import java.util.Optional;

public class LocationService implements CreateLocationUseCase, RetrieveLocationUseCase, UpdateLocationUseCase, DeleteLocationUseCase {

    private final CreateLocationUseCase createLocationUseCase;
    private final RetrieveLocationUseCase retrieveLocationUseCase;
    private final UpdateLocationUseCase updateLocationUseCase;
    private final DeleteLocationUseCase deleteLocationUseCase;

    public LocationService(CreateLocationUseCase createLocationUseCase, RetrieveLocationUseCase retrieveLocationUseCase,
                           UpdateLocationUseCase updateLocationUseCase, DeleteLocationUseCase deleteLocationUseCase) {
        this.createLocationUseCase = createLocationUseCase;
        this.retrieveLocationUseCase = retrieveLocationUseCase;
        this.updateLocationUseCase = updateLocationUseCase;
        this.deleteLocationUseCase = deleteLocationUseCase;
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

}
