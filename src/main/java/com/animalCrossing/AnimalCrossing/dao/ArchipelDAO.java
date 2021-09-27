package com.animalCrossing.AnimalCrossing.dao;

import com.animalCrossing.AnimalCrossing.bdd.Archipel;
import com.animalCrossing.AnimalCrossing.mapper.ArchipelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.jdbc.core.support.JdbcDaoSupport;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.sql.DataSource;

@Repository
@Transactional
public class ArchipelDAO extends JdbcDaoSupport {

    @Autowired
    public ArchipelDAO(DataSource dataSource) {
        this.setDataSource(dataSource);
    }

    /*public Archipel afficherArchipel(String Nom_archipel, String Localisation_archipel){
        String sqlArchipel = ArchipelMapper.animal_crossing_archipel + "where Nom_archipel = ? AND Localisation_archipel = ?";

        Object[] paramsArchipel = new Object[] {Nom_archipel,Localisation_archipel};
        ArchipelMapper mapperArchipel = new ArchipelMapper();

        System.out.println(Nom_archipel + Localisation_archipel);

        try{
            Archipel archipelInfo = this.getJdbcTemplate().queryForObject(sqlArchipel, paramsArchipel, mapperArchipel);
            return archipelInfo;
        }
        catch (EmptyResultDataAccessException e){
            return null;
        }
    }*/

    public Archipel afficherArchipelById(int id_joueur){
        String sqlArchipel = ArchipelMapper.animal_crossing_archipel + "where id_joueur = ?";
    System.out.println(sqlArchipel);
        Object[] paramsArchipel = new Object[] {id_joueur};
        ArchipelMapper mapperArchipel = new ArchipelMapper();
System.out.println(paramsArchipel);

        try{
            Archipel archipelInfo = this.getJdbcTemplate().queryForObject(sqlArchipel, paramsArchipel, mapperArchipel);
            System.out.println(archipelInfo);
            return archipelInfo;
        }

        catch (EmptyResultDataAccessException e){
            return null;
        }

    }
}
