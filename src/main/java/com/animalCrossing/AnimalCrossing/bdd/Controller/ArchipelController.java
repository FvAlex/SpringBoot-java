package com.animalCrossing.AnimalCrossing.bdd.Controller;

import com.animalCrossing.AnimalCrossing.bdd.Archipel;
import com.animalCrossing.AnimalCrossing.dao.ArchipelDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class ArchipelController {

    @Autowired
    private ArchipelDAO appArchipelDAO;


    @GetMapping("/identification")
    public String rechercherArchipel(@RequestParam("id_joueur") int id_joueur,Model model){

        Archipel archipelResultat = appArchipelDAO.afficherArchipelById(id_joueur);


        if(archipelResultat != null) {
            System.out.println(archipelResultat.getNom_archipel());
            model.addAttribute("id_joueur",archipelResultat.getId_joueur());
            model.addAttribute("id_archipel", archipelResultat.getId_archipel());
            model.addAttribute("Nom_archipel", archipelResultat.getNom_archipel());
            model.addAttribute("Localisation_archipel", archipelResultat.getLocalisation_archipel());
            System.out.println(archipelResultat.getNom_archipel());
        } else {
            return "login";
        }

        return "joueur";

    }
}
