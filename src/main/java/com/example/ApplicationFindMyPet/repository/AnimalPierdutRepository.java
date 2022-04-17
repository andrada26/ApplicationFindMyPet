package com.example.ApplicationFindMyPet.repository;

import com.example.ApplicationFindMyPet.entitites.AnimalPierdut;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AnimalPierdutRepository extends CrudRepository<AnimalPierdut,Integer> {

}
