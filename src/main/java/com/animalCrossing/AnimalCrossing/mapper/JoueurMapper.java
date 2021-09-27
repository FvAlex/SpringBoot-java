package com.animalCrossing.AnimalCrossing.mapper;

import com.animalCrossing.AnimalCrossing.bdd.Joueur;
import org.springframework.jdbc.core.RowMapper;
import java.sql.ResultSet;
import java.sql.SQLException;

public class JoueurMapper implements RowMapper<Joueur> {

    public static final String animal_crossing_joueur = "SELECT id_joueur, Nom_joueur, Prenom_joueur, Mail_joueur FROM Joueur ";

    @Override
    public Joueur mapRow(ResultSet rs,  int rowNum) throws SQLException{
        int id_joueur = rs.getInt("id_joueur");
        String nom = rs.getString("Nom_joueur");
        String prenom = rs.getString("Prenom_joueur");
        String mail = rs.getString("Mail_joueur");

        return new Joueur(id_joueur,nom, prenom, mail);
    }
}
