package com.animalCrossing.AnimalCrossing.mapper;

import com.animalCrossing.AnimalCrossing.bdd.Archipel;
import org.springframework.jdbc.core.RowMapper;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ArchipelMapper implements RowMapper<Archipel> {

    public static final String animal_crossing_archipel = "SELECT id_archipel, Nom_archipel, Localisation_archipel, id_joueur FROM Archipel ";

    @Override
    public Archipel mapRow(ResultSet rs,  int rowNum) throws SQLException{
        System.out.println("ok");
        int id_joueur = rs.getInt("id_joueur");
        int id_archipel = rs.getInt("id_archipel");
        String Nom_archipel = rs.getString("Nom_archipel");
        String Localisation_archipel = rs.getString("Localisation_archipel");
        System.out.println(id_archipel + Nom_archipel + Localisation_archipel);

        return new Archipel(id_joueur,id_archipel, Nom_archipel, Localisation_archipel);
    }
}
