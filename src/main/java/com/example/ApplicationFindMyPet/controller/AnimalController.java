package com.example.ApplicationFindMyPet.controller;

import com.example.ApplicationFindMyPet.entitites.AnimalPierdut;
import com.example.ApplicationFindMyPet.entitites.AnimalVazut;
import com.example.ApplicationFindMyPet.models.AnimalPierdutResponse;
import com.example.ApplicationFindMyPet.models.AnimalVazutResponse;
import com.example.ApplicationFindMyPet.services.AnimalPierdutService;
import com.example.ApplicationFindMyPet.services.AnimalVazutService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class AnimalController {

    @Autowired
    public AnimalPierdutService animalPierdutService;
    @Autowired
    public AnimalVazutService animalVazutService;

    public AnimalController(AnimalPierdutService animalPierdutService, AnimalVazutService animalVazutService) {
        this.animalPierdutService = animalPierdutService;
        this.animalVazutService = animalVazutService;
    }

    @CrossOrigin(origins = "*", allowedHeaders = "*")
    @PostMapping("/salveazaAnimalPierdut")
    public ResponseEntity<AnimalPierdut> salveazaAnimalPierdut(@RequestBody AnimalPierdut ap) {
        try {
            return new ResponseEntity<>(animalPierdutService.saveAnimal(ap), HttpStatus.CREATED);
        } catch (Exception e) {
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @CrossOrigin(origins = "*", allowedHeaders = "*")
    @PostMapping("/salveazaAnimalVazut")
    public ResponseEntity<AnimalVazut> salveazaAnimalVazut(@RequestBody AnimalVazut av) {
        try {
            return new ResponseEntity<>(animalVazutService.saveAnimalVazut(av), HttpStatus.CREATED);
        } catch (Exception e) {
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @CrossOrigin(origins = "*", allowedHeaders = "*")
    @GetMapping("/listAnimaleVazute")
    public ResponseEntity<List<AnimalVazutResponse>> listAnimaleVazute() {
        try {
            return new ResponseEntity<>(animalVazutService.findAllAnimaleVazute(), HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @CrossOrigin(origins = "*", allowedHeaders = "*")
    @GetMapping("/listAnimalePierdute")
    public ResponseEntity<List<AnimalPierdutResponse>> listAnimalePierdute() {
        try {
            return new ResponseEntity<>(animalPierdutService.findAllAnimals(), HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

}
