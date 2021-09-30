package com.animalCrossing.AnimalCrossing.dao;

import com.animalCrossing.AnimalCrossing.bdd.Ile;
import com.animalCrossing.AnimalCrossing.mapper.IleMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.jdbc.core.support.JdbcDaoSupport;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.sql.DataSource;

@Repository
@Transactional
public class IleDAO extends JdbcDaoSupport {

    @Autowired
    public IleDAO(DataSource dataSource) {
        this.setDataSource(dataSource);
    }

    public Ile afficherIle(int id_archipel){
        String sqlIle = IleMapper.animal_crossing_ile + "where id_archipel = ?";

        Object[] paramsIle = new Object[] {id_archipel};
        IleMapper mapperIle = new IleMapper();

        try{
            Ile IleInfo = this.getJdbcTemplate().queryForObject(sqlIle, paramsIle, mapperIle);

            return IleInfo;
        }
        catch (EmptyResultDataAccessException e){
            return null;
        }
    }

}
