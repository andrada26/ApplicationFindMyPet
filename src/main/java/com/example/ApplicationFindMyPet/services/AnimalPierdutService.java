package com.example.ApplicationFindMyPet.services;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import com.example.ApplicationFindMyPet.entitites.AnimalPierdut;
import com.example.ApplicationFindMyPet.entitites.AnimalVazut;
import com.example.ApplicationFindMyPet.models.AnimalPierdutResponse;
import com.example.ApplicationFindMyPet.models.AnimalVazutResponse;
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
    private AnimalPierdutRepository animalPierdutRepository;

    public AnimalPierdutService(AnimalPierdutRepository animalPierdutRepository) {
        this.animalPierdutRepository = animalPierdutRepository;
    }

    public AnimalPierdut saveAnimal(AnimalPierdut ap) {
        return animalPierdutRepository.save(ap);
    }

    public AnimalPierdut findAnimalById(int id) throws Exception {
        Optional<AnimalPierdut> animal = animalPierdutRepository.findById(id);
        if (animal.isPresent()) {
            return animal.get();
        } else {
            throw new Exception("");
        }
    }

    public List<AnimalPierdutResponse> findAllAnimals() {
            Iterable<AnimalPierdut> animals= animalPierdutRepository.findAll();
            List<AnimalPierdutResponse> response = new ArrayList<>();

            for(AnimalPierdut a : animals){
                AnimalPierdutResponse ar = new AnimalPierdutResponse();
                ar.setNumeAnimal(a.getNumeAnimal());
                ar.setTip(a.getTip());
                ar.setRasa(a.getRasa());
                ar.setDescriere(a.getDescriere());
                ar.setNumeStapan(a.getNumeStapan());
                ar.setPrenumeStapan(a.getPrenumeStapan());
                ar.setMail(a.getMail());
                ar.setTelefon(a.getTelefon());
                String[] coordonate = a.getLocatieVazut().split(" ");
                ar.setLatitudine(Double.parseDouble(coordonate[0]));
                ar.setLongitudine(Double.parseDouble(coordonate[1]));
                response.add(ar);
            }

            return response;

    }

}
