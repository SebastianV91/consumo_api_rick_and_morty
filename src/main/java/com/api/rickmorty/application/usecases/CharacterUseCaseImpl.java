package com.api.rickmorty.application.usecases;

import com.api.rickmorty.domain.model.Character;
import com.api.rickmorty.domain.ports.in.CharacterUseCase;
import com.api.rickmorty.domain.ports.out.CharacterRepositoryPort;
import com.api.rickmorty.domain.ports.out.ExternalServicePort;
import com.api.rickmorty.infrastructure.dto.CharacterDTO;

import java.util.List;
import java.util.Optional;

public class CharacterUseCaseImpl implements CharacterUseCase {

    private final CharacterRepositoryPort characterRepositoryPort;

    public CharacterUseCaseImpl(CharacterRepositoryPort characterRepositoryPort) {
        this.characterRepositoryPort = characterRepositoryPort;
    }

    @Override
    public Character createCharacter(Character character) {
        return characterRepositoryPort.save(character);
    }

    @Override
    public boolean deleteCharacter(Integer id) {
        return characterRepositoryPort.deleteById(id);
    }

    @Override
    public Optional<Character> getCharacterById(Integer id) {
        return characterRepositoryPort.findById(id);
    }

    @Override
    public List<Character> getAllCharacters() {
        return characterRepositoryPort.findAll();
    }

    @Override
    public Optional<Character> updateCharacter(Integer id, Character updateCharacter) {
        return characterRepositoryPort.update(updateCharacter);
    }

}
