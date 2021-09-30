package com.animalCrossing.AnimalCrossing.mapper;

import com.animalCrossing.AnimalCrossing.bdd.Ile;
import org.springframework.jdbc.core.RowMapper;
import java.sql.ResultSet;
import java.sql.SQLException;

public class IleMapper implements RowMapper<Ile> {

    public static final String animal_crossing_ile = "SELECT id_ile, Nom_ile, Prenom_ile, id_archipel FROM ile ";

    @Override
    public Ile mapRow(ResultSet rs,  int rowNum) throws SQLException{

        int id_archipel = rs.getInt("id_archipel");
        int id_ile = rs.getInt("id_ile");
        String Nom_ile = rs.getString("Nom_ile");
        String Prenom_ile = rs.getString("Prenom_ile");

        return new Ile(id_archipel,id_ile,Nom_ile, Prenom_ile);
    }
}
