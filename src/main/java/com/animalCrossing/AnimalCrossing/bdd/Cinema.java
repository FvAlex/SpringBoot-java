package com.animalCrossing.AnimalCrossing.bdd;

public class Cinema {
    private int id;
    private String nom;
    private String billet;

    public Cinema(int id, String nom, String billet){
        this.id = id;
        this.nom = nom;
        this.billet = billet;
    }

    // Gettet et Setter


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getBillet() {
        return billet;
    }

    public void setBillet(String billet) {
        this.billet = billet;
    }
}
