package com.api.rickmorty.domain.ports.in;

import com.api.rickmorty.domain.model.Location;

public interface CreateLocationUseCase {

    Location createLocation(Location location);

}
