package com.api.rickmorty.domain.ports.in;


import com.api.rickmorty.domain.model.Character;
import com.api.rickmorty.infrastructure.dto.CharacterDTO;

import java.util.List;
import java.util.Optional;

public interface CharacterUseCase {

    Character createCharacter(Character character);

    boolean deleteCharacter(Integer id);

    Optional<Character> getCharacterById(Integer id);

    List<Character> getAllCharacters();

    Optional<Character> updateCharacter(Integer id, Character updateCharacter);

}
