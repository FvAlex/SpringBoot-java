package com.animalCrossing.AnimalCrossing.bdd;

public class Ile {

    private int id_archipel;
    private int id_ile;
    private String Nom_ile;
    private String Prenom_ile;


    public Ile(int id_archipel, int id_ile, String Nom_ile, String Prenom_ile){
        this.id_archipel = id_archipel;
        this.id_ile = id_ile;
        this.Nom_ile = Nom_ile;
        this.Prenom_ile = Prenom_ile;
    }

    // Getter et Setter


    public int getId_ile() {
        return id_ile;
    }

    public void setId_ile(int id_ile) {
        this.id_ile = id_ile;
    }

    public String getNom_ile() {
        return Nom_ile;
    }

    public void setNom_ile(String nom_ile) {
        Nom_ile = nom_ile;
    }

    public String getPrenom_ile() {
        return Prenom_ile;
    }

    public void setPrenom_ile(String prenom_ile) {
        Prenom_ile = prenom_ile;
    }

    public int getId_archipel() {
        return id_archipel;
    }

    public void setId_archipel(int id_archipel) {
        this.id_archipel = id_archipel;
    }
}
