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

    public Archipel afficherArchipelById(int id_joueur){
        String sqlArchipel = ArchipelMapper.animal_crossing_archipel + "where id_joueur = ?";

        Object[] paramsArchipel = new Object[] {id_joueur};
        ArchipelMapper mapperArchipel = new ArchipelMapper();

        try{
            Archipel archipelInfo = this.getJdbcTemplate().queryForObject(sqlArchipel, paramsArchipel, mapperArchipel);
            return archipelInfo;
        }

        catch (EmptyResultDataAccessException e){
            return null;
        }

    }
}
