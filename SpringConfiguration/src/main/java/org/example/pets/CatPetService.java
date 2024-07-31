package org.example.pets;

public class CatPetService implements PetService {

    @Override
    public String getPetType() {
        return "Hello world from Cats!";
    }
}
