package com.api.rickmorty.domain.ports.in;

import com.api.rickmorty.domain.model.Location;

import java.util.List;
import java.util.Optional;

public interface RetrieveLocationUseCase {

    Optional<Location> getLocationById(Integer id);

    List<Location> getAllLocations();

}
