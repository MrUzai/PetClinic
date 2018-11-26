package de.brandtkollmar.petclinic.services;

import de.brandtkollmar.petclinic.model.Owner;

public interface OwnerService extends CrudService<Owner, Long>{
    
    Owner findByLastName(String lastName);
    
}
