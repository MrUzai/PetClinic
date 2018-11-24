package de.brandtkollmar.petclinic.model;

import java.time.LocalDate;

public class Pet {

    private PetType petType;
    private LocalDate bithDate;
    private Owner owner;

    public PetType getPetType() {
        return petType;
    }

    public void setPetType(PetType petType) {
        this.petType = petType;
    }

    public LocalDate getBithDate() {
        return bithDate;
    }

    public void setBithDate(LocalDate bithDate) {
        this.bithDate = bithDate;
    }

    public Owner getOwner() {
        return owner;
    }

    public void setOwner(Owner owner) {
        this.owner = owner;
    }
}
