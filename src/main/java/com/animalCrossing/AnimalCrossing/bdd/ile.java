package com.animalCrossing.AnimalCrossing.bdd;

public class ile {

    private int id;
    private String nom;
    private String prenom;


    public ile(int id, String nom, String prenom){
        this.id = id;
        this.nom = nom;
        this.prenom = prenom;
    }

    // Getter et Setter


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

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }
}
