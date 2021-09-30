package com.animalCrossing.AnimalCrossing.dao;

import com.animalCrossing.AnimalCrossing.AnimalCrossingApplication;
import com.animalCrossing.AnimalCrossing.bdd.Joueur;
import com.animalCrossing.AnimalCrossing.mapper.JoueurMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.jdbc.core.support.JdbcDaoSupport;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.sql.DataSource;

@Repository
@Transactional
public class JoueurDAO extends JdbcDaoSupport {

    @Autowired
    public JoueurDAO(DataSource dataSource) {
        this.setDataSource(dataSource);
    }

    public Joueur afficherJoueur(String nom, String prenom, String mail){
        String sqlJoueur = JoueurMapper.animal_crossing_joueur + "where Nom_joueur = ? AND Prenom_joueur = ? AND Mail_joueur = ?";

        Object[] paramsJoueur = new Object[] {nom, prenom, mail};
        JoueurMapper mapperJoueur = new JoueurMapper();

        try{
            Joueur joueurInfo = this.getJdbcTemplate().queryForObject(sqlJoueur, paramsJoueur, mapperJoueur);

            return joueurInfo;
        }
        catch (EmptyResultDataAccessException e){
            return null;
        }
    }

    public Joueur updateJoueur(String nom, String prenom, String mail){
        String sqlupdateJoueur = "UPDATE Nom_joueur = ?, Prenom_joueur = ?, Mail_joueur = ? FROM Joueur WHERE id_joueur = ?";

        Object[] joueur = new Object[] {nom, prenom, mail};
        JoueurMapper Joueur = new JoueurMapper();
        try{
            Joueur joueurInfo = this.getJdbcTemplate().queryForObject(sqlupdateJoueur,joueur,Joueur);

            return joueurInfo;
        }
        catch (EmptyResultDataAccessException e){
            return null;
        }
    }
}
