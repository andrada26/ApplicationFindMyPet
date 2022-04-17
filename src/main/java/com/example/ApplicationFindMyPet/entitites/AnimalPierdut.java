package com.example.ApplicationFindMyPet.entitites;

import javax.persistence.*;

@Entity
@Table
public class AnimalPierdut {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idAnimalPierdut;
    private String numeAnimal;

    private String tip;
    private String rasa;
    private String descriere;
    private String locatieVazut;
    private String numeStapan;
    private String prenumeStapan;
    private String mail;
    private String telefon;

    public AnimalPierdut() {
    }

    public String getNumeAnimal() {
        return numeAnimal;
    }

    public void setNumeAnimal(String numeAnimal) {
        this.numeAnimal = numeAnimal;
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

    public String getLocatieVazut() {
        return locatieVazut;
    }

    public void setLocatieVazut(String locatieVazut) {
        this.locatieVazut = locatieVazut;
    }

    public String getNumeStapan() {
        return numeStapan;
    }

    public void setNumeStapan(String numeStapan) {
        this.numeStapan = numeStapan;
    }

    public String getPrenumeStapan() {
        return prenumeStapan;
    }

    public void setPrenumeStapan(String prenumeStapan) {
        this.prenumeStapan = prenumeStapan;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getTelefon() {
        return telefon;
    }

    public void setTelefon(String telefon) {
        this.telefon = telefon;
    }
}
