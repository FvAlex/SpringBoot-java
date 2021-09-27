package com.animalCrossing.AnimalCrossing.bdd;


import org.springframework.boot.SpringApplicationRunListener;

public class Archipel {

    private int id_joueur;
    private int id_archipel;
    private String Nom_archipel;
    private String Localisation_archipel;

    public Archipel(int id_joueur, int id_archipel, String Nom_archipel, String Localisation_archipel){
        this.id_joueur = id_joueur;
        this.id_archipel = id_archipel;
        this.Nom_archipel = Nom_archipel;
        this.Localisation_archipel = Localisation_archipel;
    }

    // Getter et Setter


    public int getId_archipel() {
        return id_archipel;
    }

    public void setId_archipel(int id_archipel) {
        this.id_archipel = id_archipel;
    }

    public String getNom_archipel() {
        return Nom_archipel;
    }

    public void setNom_archipel(String nom_archipel) {
        Nom_archipel = nom_archipel;
    }

    public String getLocalisation_archipel() {
        return Localisation_archipel;
    }

    public void setLocalisation_archipel(String localisation_archipel) {
        Localisation_archipel = localisation_archipel;
    }

    public int getId_joueur() {
        return id_joueur;
    }

    public void setId_joueur(int id_joueur) {
        this.id_joueur = id_joueur;
    }
}
