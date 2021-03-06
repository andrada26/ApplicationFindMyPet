package com.example.ApplicationFindMyPet.services;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import com.example.ApplicationFindMyPet.entitites.AnimalVazut;
import com.example.ApplicationFindMyPet.models.AnimalVazutResponse;
import com.example.ApplicationFindMyPet.repository.AnimalVazutRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.IncorrectResultSizeDataAccessException;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

@Service
public class AnimalVazutService  {
    @Autowired
    private AnimalVazutRepository animalVazutRepository;

    public AnimalVazutService(AnimalVazutRepository animalVazutRepository) {
        this.animalVazutRepository = animalVazutRepository;
    }

    public AnimalVazut saveAnimalVazut(AnimalVazut ap) {
        return animalVazutRepository.save(ap);
    }
    public AnimalVazut findById(int id) throws Exception {
            Optional<AnimalVazut> ap = animalVazutRepository.findById(id);
            if(ap.isPresent()){
                return ap.get();
            }
            else {
                throw new Exception();
            }

    }

    public List<AnimalVazutResponse> findAllAnimaleVazute() {
        Iterable<AnimalVazut> animals= animalVazutRepository.findAll();
        List<AnimalVazutResponse> response = new ArrayList<>();

        for(AnimalVazut a : animals){
            AnimalVazutResponse ar = new AnimalVazutResponse();
            ar.setTip(a.getTip());
            ar.setDescriere(a.getDescriere());
            ar.setRasa(a.getRasa());
            String[] coordonate = a.getLocatiePierdut().split(" ");
            ar.setLatitudine(Double.parseDouble(coordonate[0]));
            ar.setLongitudine(Double.parseDouble(coordonate[1]));
            response.add(ar);
        }

        return response;
    }


}
