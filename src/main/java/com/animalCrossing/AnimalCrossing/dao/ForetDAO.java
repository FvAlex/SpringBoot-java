package com.animalCrossing.AnimalCrossing.dao;

import com.animalCrossing.AnimalCrossing.bdd.Foret;
import com.animalCrossing.AnimalCrossing.mapper.ForetMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.jdbc.core.support.JdbcDaoSupport;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.sql.DataSource;

@Repository
@Transactional
public class ForetDAO extends JdbcDaoSupport {

    @Autowired
    public ForetDAO(DataSource dataSource) {
        this.setDataSource(dataSource);
    }

    public Foret afficherForetById(int id_ile){
        String sqlForet = ForetMapper.animal_crossing_foret + "where id_ile = ?";

        Object[] paramsForet = new Object[] {id_ile};
        ForetMapper mapperForet = new ForetMapper();

        try{
            Foret foretInfo = this.getJdbcTemplate().queryForObject(sqlForet, paramsForet, mapperForet);
            return foretInfo;
        }

        catch (EmptyResultDataAccessException e){
            return null;
        }

    }
}
