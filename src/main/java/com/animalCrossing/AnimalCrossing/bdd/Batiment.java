package com.animalCrossing.AnimalCrossing.bdd;

public class Batiment {
    private int id_ile;
    private int id_batiment;
    private String nom_batiment;

    public  Batiment(int id_ile,int id_batiment, String nom_batiment){
        this.id_ile = id_ile;
        this.id_batiment = id_batiment;
        this.nom_batiment = nom_batiment;

    }

    // Getter et Setter


    public int getId_ile() {
        return id_ile;
    }

    public void setId_ile(int id_ile) {
        this.id_ile = id_ile;
    }

    public int getId_batiment() {
        return id_batiment;
    }

    public void setId_batiment(int id_batiment) {
        this.id_batiment = id_batiment;
    }

    public String getNom_batiment() {
        return nom_batiment;
    }

    public void setNom_batiment(String nom_batiment) {
        this.nom_batiment = nom_batiment;
    }
}
