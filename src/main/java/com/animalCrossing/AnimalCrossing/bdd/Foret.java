package com.animalCrossing.AnimalCrossing.bdd;

public class Foret {
    private int id_ile;
    private int id_foret;
    private String nom_foret;
    private String superficie_foret;


    public Foret(int id_ile, int id_foret, String nom_foret, String superficie_foret){
        this.id_ile = id_ile;
        this.id_foret = id_foret;
        this.nom_foret = nom_foret;
        this.superficie_foret = superficie_foret;
    }

    // Getter et Setter


    public int getId_ile() {
        return id_ile;
    }

    public void setId_ile(int id_ile) {
        this.id_ile = id_ile;
    }

    public int getId_foret() {
        return id_foret;
    }

    public void setId_foret(int id_foret) {
        this.id_foret = id_foret;
    }

    public String getSuperficie_foret() {
        return superficie_foret;
    }

    public void setSuperficie_foret(String superficie_foret) {
        this.superficie_foret = superficie_foret;
    }

    public String getNom_foret() {
        return nom_foret;
    }

    public void setNom_foret(String nom_foret) {
        this.nom_foret = nom_foret;
    }
}
