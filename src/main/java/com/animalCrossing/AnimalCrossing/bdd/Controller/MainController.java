package com.animalCrossing.AnimalCrossing.bdd.Controller;

import com.animalCrossing.AnimalCrossing.bdd.*;
import com.animalCrossing.AnimalCrossing.dao.*;
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
    @Autowired
    private IleDAO appIleDAO;
    @Autowired
    private BatimentDAO appBatimentDAO;
    @Autowired
    private ForetDAO appForetDAO;



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

                    Ile ileResultat = appIleDAO.afficherIle(archipelResultat.getId_archipel());

                    if(ileResultat != null){

                        Batiment batimentResultat = appBatimentDAO.afficherBatimentById(ileResultat.getId_ile());

                            if(batimentResultat != null){

                                model.addAttribute("id_batiment", batimentResultat.getId_batiment());
                                model.addAttribute("Nom_batiment", batimentResultat.getNom_batiment());

                            }

                        Foret foretResultat = appForetDAO.afficherForetById(ileResultat.getId_ile());

                            if(foretResultat != null){

                                model.addAttribute("id_foret", foretResultat.getId_foret());
                                model.addAttribute("Nom_foret", foretResultat.getNom_foret());
                                model.addAttribute("Superficie_foret", foretResultat.getSuperficie_foret());
                            }
                        model.addAttribute("id_ile", ileResultat.getId_ile());
                        model.addAttribute("Nom_ile", ileResultat.getNom_ile());
                        model.addAttribute("Prenom_ile",ileResultat.getPrenom_ile());

                    }

                    model.addAttribute("id_archipel", archipelResultat.getId_archipel());
                    model.addAttribute("Nom_archipel", archipelResultat.getNom_archipel());
                    model.addAttribute("Localisation_archipel", archipelResultat.getLocalisation_archipel());
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

    @PostMapping("/updateJoueur")
    public String JoueurUpdate(@RequestParam("nom") String nom, @RequestParam("prenom") String prenom, @RequestParam("mail") String mail
                                ,Model model){
        Joueur joueurResultat = appJoueurDAO.updateJoueur(nom, prenom, mail);

        model.addAttribute("nom", joueurResultat.getNom());
        model.addAttribute("prenom", joueurResultat.getPrenom());
        model.addAttribute("mail", joueurResultat.getMail());

        return "joueur";
    }
}
