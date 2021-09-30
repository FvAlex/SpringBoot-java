package com.animalCrossing.AnimalCrossing.mapper;

import com.animalCrossing.AnimalCrossing.bdd.Foret;
import org.springframework.jdbc.core.RowMapper;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ForetMapper implements RowMapper<Foret> {

    public static final String animal_crossing_foret = "SELECT id_ile, id_foret, Nom_foret, Superficie_foret FROM Foret ";

    @Override
    public Foret mapRow(ResultSet rs, int rowNum) throws SQLException{

        int id_ile= rs.getInt("id_ile");
        int id_foret = rs.getInt("id_foret");
        String Nom_foret = rs.getString("Nom_Foret");
        String Superficie_foret = rs.getString("Superficie_foret");

        return new Foret(id_ile, id_foret, Nom_foret, Superficie_foret);
    }
}
