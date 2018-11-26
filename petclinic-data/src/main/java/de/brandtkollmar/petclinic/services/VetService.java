package de.brandtkollmar.petclinic.services;

import de.brandtkollmar.petclinic.model.Vet;

import java.util.Set;

public interface VetService {

    Vet findById(long id);
    Vet save(Vet owner);
    Set<Vet> findAll();
    
}
