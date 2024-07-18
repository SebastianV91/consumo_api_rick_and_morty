package com.api.rickmorty.domain.ports.in;

import com.api.rickmorty.domain.model.Location;

import java.util.Optional;

public interface UpdateLocationUseCase {

    Optional<Location> updateLocation(Integer id, Location updateLocation);

}
