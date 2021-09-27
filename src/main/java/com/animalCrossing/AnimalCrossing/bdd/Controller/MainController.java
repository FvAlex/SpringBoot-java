package com.animalCrossing.AnimalCrossing.bdd.Controller;

import com.animalCrossing.AnimalCrossing.bdd.Archipel;
import com.animalCrossing.AnimalCrossing.bdd.Joueur;
import com.animalCrossing.AnimalCrossing.dao.ArchipelDAO;
import com.animalCrossing.AnimalCrossing.dao.JoueurDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class MainController {

    @Autowired
    private JoueurDAO appJoueurDAO;
    @Autowired
    private ArchipelDAO appArchipelDAO;


    @GetMapping("/")
    public String accueil(Model model){
        return "login";
    }

    @PostMapping("/identification")
    public String rechercheJoueur(@RequestParam("nom") String nom, @RequestParam("prenom") String prenom, @RequestParam("mail") String mail
                                  ,Model model){

        Joueur joueurResultat = appJoueurDAO.afficherJoueur(nom, prenom, mail);

        if(joueurResultat != null) {
            Archipel archipelResultat = appArchipelDAO.afficherArchipelById(joueurResultat.getId());

                if(archipelResultat != null) {

                    System.out.println(archipelResultat.getNom_archipel());
                    model.addAttribute("id_archipel", archipelResultat.getId_archipel());
                    model.addAttribute("Nom_archipel", archipelResultat.getNom_archipel());
                    model.addAttribute("Localisation_archipel", archipelResultat.getLocalisation_archipel());
                    System.out.println(archipelResultat.getNom_archipel());
                }

            model.addAttribute("id_joueur", joueurResultat.getId());
            model.addAttribute("nom", joueurResultat.getNom());
            model.addAttribute("prenom", joueurResultat.getPrenom());
            model.addAttribute("mail", joueurResultat.getMail());


        } else {
            model.addAttribute("verify", true);
            return "login";
        }




        return "joueur";
    }

}
