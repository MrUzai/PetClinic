package de.brandtkollmar.petclinic.services.map;

import java.util.*;

abstract class AbstractMapService<Type, ID> {
    
    Map<ID, Type> map = new HashMap<>();
    
    Set<Type> findAll(){
        return new HashSet<>(map.values());
    }
    
    Type findById(ID id){
        return map.get(id);
    }
    
    Type save(ID id, Type object){
        map.put(id, object);
        
        return object;
    }
    
    void deleteById(ID id){
        map.remove(id);
    }
    
    void delete(Type object){
        map.entrySet().removeIf(e -> e.getValue().equals(object));
    }
}
