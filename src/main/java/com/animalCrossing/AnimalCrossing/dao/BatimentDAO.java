package com.animalCrossing.AnimalCrossing.dao;

import com.animalCrossing.AnimalCrossing.bdd.Batiment;
import com.animalCrossing.AnimalCrossing.mapper.BatimentMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.jdbc.core.support.JdbcDaoSupport;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.sql.DataSource;

@Repository
@Transactional
public class BatimentDAO extends JdbcDaoSupport {

    @Autowired
    public BatimentDAO(DataSource dataSource) {
        this.setDataSource(dataSource);
    }

    public Batiment afficherBatimentById(int id_ile){
        String sqlBatiment = BatimentMapper.animal_crossing_batiment + "where id_ile = ?";

        Object[] paramsBatiment = new Object[] {id_ile};
        BatimentMapper mapperBatiment = new BatimentMapper();

        try{
            Batiment batimentInfo = this.getJdbcTemplate().queryForObject(sqlBatiment, paramsBatiment, mapperBatiment);
            return batimentInfo;
        }

        catch (EmptyResultDataAccessException e){
            return null;
        }

    }
}
