package com.api.rickmorty.domain.ports.out;

import com.api.rickmorty.domain.model.Character;

import java.util.List;
import java.util.Optional;

public interface CharacterRepositoryPort {

    Character save(Character character);
    Optional<Character> findById(Integer id);
    List<Character> findAll();
    Optional<Character> update(Character character);
    boolean deleteById(Integer id);

}
