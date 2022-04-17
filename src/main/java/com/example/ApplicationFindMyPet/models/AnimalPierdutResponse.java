package com.example.ApplicationFindMyPet.models;

public class AnimalPierdutResponse {

    private String numeAnimal;
    private String tip;
    private String rasa;
    private String descriere;
    private String numeStapan;
    private String prenumeStapan;
    private String mail;
    private String telefon;
    private Double longitudine;
    private Double latitudine;

    public AnimalPierdutResponse() {
    }

    public String getNumeAnimal() {
        return numeAnimal;
    }

    public void setNumeAnimal(String numeAnimal) {
        this.numeAnimal = numeAnimal;
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

    public Double getLongitudine() {
        return longitudine;
    }

    public void setLongitudine(Double longitudine) {
        this.longitudine = longitudine;
    }

    public Double getLatitudine() {
        return latitudine;
    }

    public void setLatitudine(Double latitudine) {
        this.latitudine = latitudine;
    }
}
