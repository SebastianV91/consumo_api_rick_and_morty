package com.api.rickmorty.infrastructure.repositories;

import com.api.rickmorty.infrastructure.entities.CharacterEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CharacterRepository extends JpaRepository<CharacterEntity, Integer> {

}
