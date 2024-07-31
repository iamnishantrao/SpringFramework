package org.example.springconfiguration.controllers;

import org.example.pets.PetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class PetController {

    private final PetService petService;

    @Autowired
    public PetController(PetService petService) {
        this.petService = petService;
    }

    public String getCurrentPet() {
        return petService.getPetType();
    }
}
