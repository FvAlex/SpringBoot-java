package com.animalCrossing.AnimalCrossing.mapper;

import com.animalCrossing.AnimalCrossing.bdd.Batiment;
import org.springframework.jdbc.core.RowMapper;
import java.sql.ResultSet;
import java.sql.SQLException;

public class BatimentMapper implements RowMapper<Batiment> {

    public static final String animal_crossing_batiment = "SELECT id_batiment, Nom_batiment, id_ile FROM Batiment ";

    @Override
    public Batiment mapRow(ResultSet rs,  int rowNum) throws SQLException{

        int id_ile= rs.getInt("id_ile");
        int id_batiment = rs.getInt("id_batiment");
        String Nom_batiment = rs.getString("Nom_batiment");

        return new Batiment(id_ile, id_batiment, Nom_batiment);
    }
}
