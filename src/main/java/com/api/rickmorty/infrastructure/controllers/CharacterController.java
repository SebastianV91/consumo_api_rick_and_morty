package com.api.rickmorty.infrastructure.controllers;

import com.api.rickmorty.application.services.CharacterService;
import com.api.rickmorty.infrastructure.dto.CharacterDTO;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/characters")
public class CharacterController {

    private final CharacterService characterService;

    public CharacterController(CharacterService characterService) {
        this.characterService = characterService;
    }

    @GetMapping("/additional-info-character")
    public ResponseEntity<CharacterDTO> getAdditionalInfoCharacter(){
        CharacterDTO characterDTO = characterService.getAdditionalCharacterInfo();
        return new ResponseEntity<>(characterDTO, HttpStatus.OK);
    }

}
