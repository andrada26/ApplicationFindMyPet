package com.example.ApplicationFindMyPet.entitites;

import javax.persistence.*;

@Entity
@Table
public class AnimalVazut {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idAnimalPierdut;
    private String tip;
    private String rasa;
    private String descriere;
    private String locatiePierdut;
    private int idUser;

    public AnimalVazut() {
    }

    public int getIdAnimalPierdut() {
        return idAnimalPierdut;
    }

    public void setIdAnimalPierdut(int idAnimalPierdut) {
        this.idAnimalPierdut = idAnimalPierdut;
    }

    public String getTip() {
        return tip;
    }

    public void setTip(String tip) {
        this.tip = tip;
    }

    public String getRasa() {
        return rasa;
    }

    public void setRasa(String rasa) {
        this.rasa = rasa;
    }

    public String getDescriere() {
        return descriere;
    }

    public void setDescriere(String descriere) {
        this.descriere = descriere;
    }

    public String getLocatiePierdut() {
        return locatiePierdut;
    }

    public void setLocatiePierdut(String locatiePierdut) {
        this.locatiePierdut = locatiePierdut;
    }

    public int getIdUser() {
        return idUser;
    }

    public void setIdUser(int idUser) {
        this.idUser = idUser;
    }
}
