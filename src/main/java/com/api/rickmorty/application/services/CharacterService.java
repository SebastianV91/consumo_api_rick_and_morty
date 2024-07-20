package com.api.rickmorty.application.services;

import com.api.rickmorty.domain.model.Character;
import com.api.rickmorty.domain.ports.in.CharacterUseCase;
import com.api.rickmorty.domain.ports.in.GetAdditionalCharacterInfoUseCase;
import com.api.rickmorty.infrastructure.dto.CharacterDTO;

import java.util.List;
import java.util.Optional;

public class CharacterService implements CharacterUseCase, GetAdditionalCharacterInfoUseCase {

    private final CharacterUseCase characterUseCase;
    private final GetAdditionalCharacterInfoUseCase getAdditionalCharacterInfoUseCase;

    public CharacterService(CharacterUseCase characterUseCase, GetAdditionalCharacterInfoUseCase getAdditionalCharacterInfoUseCase) {
        this.characterUseCase = characterUseCase;
        this.getAdditionalCharacterInfoUseCase = getAdditionalCharacterInfoUseCase;
    }

    @Override
    public Character createCharacter(Character character) {
        return characterUseCase.createCharacter(character);
    }

    @Override
    public boolean deleteCharacter(Integer id) {
        return characterUseCase.deleteCharacter(id);
    }

    @Override
    public Optional<Character> getCharacterById(Integer id) {
        return characterUseCase.getCharacterById(id);
    }

    @Override
    public List<Character> getAllCharacters() {
        return characterUseCase.getAllCharacters();
    }

    @Override
    public Optional<Character> updateCharacter(Integer id, Character updateCharacter) {
        return characterUseCase.updateCharacter(id, updateCharacter);
    }

    @Override
    public CharacterDTO getAdditionalCharacterInfo() {
        return getAdditionalCharacterInfoUseCase.getAdditionalCharacterInfo();
    }
}
