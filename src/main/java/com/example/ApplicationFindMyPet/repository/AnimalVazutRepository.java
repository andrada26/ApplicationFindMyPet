package com.example.ApplicationFindMyPet.repository;

import com.example.ApplicationFindMyPet.entitites.AnimalVazut;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface AnimalVazutRepository extends CrudRepository<AnimalVazut,Integer> {

}
