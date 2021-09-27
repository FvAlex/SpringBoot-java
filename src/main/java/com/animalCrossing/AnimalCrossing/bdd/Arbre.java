package com.animalCrossing.AnimalCrossing.bdd;

public class Arbre {
    private int id;
    private String nom;

    public Arbre(int id, String nom){
        this.id = id;
        this.nom = nom;
    }

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
}
