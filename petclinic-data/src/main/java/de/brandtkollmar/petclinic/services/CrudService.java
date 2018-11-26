package de.brandtkollmar.petclinic.services;

import de.brandtkollmar.petclinic.model.Owner;

import java.util.Set;

public interface CrudService<Type, ID> {

    Type findById(ID id);
    Type save(Type object);
    Set<Type> findAll();
    
    void delete(Type object);
    
    void deleteById(ID id);
        
    
}
