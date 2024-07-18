package com.api.rickmorty.domain.ports.out;

import com.api.rickmorty.domain.model.Location;

import java.util.List;
import java.util.Optional;

public interface LocationRepositoryPort {
    Location save(Location location);
    Optional<Location> findById(Integer id);
    List<Location> findAll();
    Optional<Location> update(Location location);
    boolean deleteById(Integer id);
}
