package com.api.rickmorty.infrastructure.repositories;

import com.api.rickmorty.domain.model.Character;
import com.api.rickmorty.domain.ports.out.CharacterRepositoryPort;
import com.api.rickmorty.infrastructure.entities.CharacterEntity;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Component
public class CharacterRepositoryAdapter implements CharacterRepositoryPort {

    private final CharacterRepository characterRepository;

    public CharacterRepositoryAdapter(CharacterRepository characterRepository) {
        this.characterRepository = characterRepository;
    }

    @Override
    public Character save(Character character) {
        CharacterEntity characterEntity = CharacterEntity.fromDomainModel(character);
        CharacterEntity savedCharacterEntity = characterRepository.save(characterEntity);
        return savedCharacterEntity.toDomainModel();
    }

    @Override
    public Optional<Character> findById(Integer id) {
        return characterRepository.findById(id).map(CharacterEntity::toDomainModel);
    }

    @Override
    public List<Character> findAll() {
        return characterRepository.findAll().stream()
                .map(CharacterEntity::toDomainModel)
                .collect(Collectors.toList());
    }

    @Override
    public Optional<Character> update(Character location) {
        if(characterRepository.existsById(location.getId())){
            CharacterEntity characterEntity = CharacterEntity.fromDomainModel(location);
            CharacterEntity updatedCharacterEntity = characterRepository.save(characterEntity);
            return Optional.of(updatedCharacterEntity.toDomainModel());
        }
        return Optional.empty();
    }

    @Override
    public boolean deleteById(Integer id) {
        if(characterRepository.existsById(id)){
            characterRepository.deleteById(id);
            return true;
        }
        return false;
    }
}
