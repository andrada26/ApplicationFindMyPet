package com.example.ApplicationFindMyPet.services;
import java.util.List;
import java.util.Optional;

import com.example.ApplicationFindMyPet.entitites.AnimalPierdut;
import com.example.ApplicationFindMyPet.repository.AnimalPierdutRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.IncorrectResultSizeDataAccessException;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

@Service
public class AnimalPierdutService {

    @Autowired
    private AnimalPierdutRepository jdbcTemplate;

    public AnimalPierdutService(AnimalPierdutRepository jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    public AnimalPierdut saveAnimal(AnimalPierdut ap) {
        return jdbcTemplate.save(ap);
    }


    public Iterable<AnimalPierdut> findAllAnimals() {
        return jdbcTemplate.findAll();
    }
    public AnimalPierdut findAnimalById(int id) throws Exception {
        Optional<AnimalPierdut> animal = jdbcTemplate.findById(id);
        if(animal.isPresent()){
            return animal.get();}
        else {
            throw new Exception("");
        }
    }

}
