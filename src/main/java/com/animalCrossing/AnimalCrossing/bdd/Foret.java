package com.animalCrossing.AnimalCrossing.bdd;

public class Foret {
    private int id;
    private String superficie;
    private String nom;

    public Foret(int id, String superficie, String nom){
        this.id = id;
        this.superficie = superficie;
        this.nom = nom;
    }

    // Getter et Setter


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getSuperficie() {
        return superficie;
    }

    public void setSuperficie(String superficie) {
        this.superficie = superficie;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }
}
