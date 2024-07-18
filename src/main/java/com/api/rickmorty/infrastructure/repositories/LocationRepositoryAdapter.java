package com.api.rickmorty.infrastructure.repositories;

import com.api.rickmorty.domain.model.Location;
import com.api.rickmorty.domain.ports.out.LocationRepositoryPort;
import com.api.rickmorty.infrastructure.entities.LocationEntity;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Component
public class LocationRepositoryAdapter implements LocationRepositoryPort {

    private final LocationRepository locationRepository;

    public LocationRepositoryAdapter(LocationRepository locationRepository) {
        this.locationRepository = locationRepository;
    }

    @Override
    public Location save(Location location) {
        LocationEntity locationEntity = LocationEntity.fromDomainModel(location);
        LocationEntity savedLocationEntity = locationRepository.save(locationEntity);
        return savedLocationEntity.toDomainModel();
    }

    @Override
    public Optional<Location> findById(Integer id) {
        return locationRepository.findById(id).map(LocationEntity::toDomainModel);
    }

    @Override
    public List<Location> findAll() {
        return locationRepository.findAll().stream()
                .map(LocationEntity::toDomainModel)
                .collect(Collectors.toList());
    }

    @Override
    public Optional<Location> update(Location location) {
        if(locationRepository.existsById(location.getId())){
            LocationEntity locationEntity = LocationEntity.fromDomainModel(location);
            LocationEntity updatedlocationEntity = locationRepository.save(locationEntity);
            return Optional.of(updatedlocationEntity.toDomainModel());
        }
        return Optional.empty();
    }

    @Override
    public boolean deleteById(Integer id) {
        if(locationRepository.existsById(id)){
            locationRepository.deleteById(id);
            return true;
        }
        return false;
    }
}
