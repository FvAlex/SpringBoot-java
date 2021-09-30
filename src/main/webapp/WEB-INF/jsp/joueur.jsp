<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page pageEncoding="UTF-8" %>

<!DOCTYPE html>
<html>
    <head>
        <title> Joueur </title>
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
        <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/css/styleJoueur.css">

    </head> 
    <body>
        <div class="navbar">
            <div class="nabvar_logo">
                    <img src="/logoAccueil.png" height="100px" alt="logo"/></a>
            </div>
            <div class="navbar_menu">
                <div class="navbar_menu--joueur navbar_menu--size navbar_space_box_menu ">
                    <p>Joueur</p></a>
                </div>
                <div class="navbar_menu--ile navbar_menu--size navbar_space_box_menu">
                    <p>Iles</p>
                </div>
                <div class="navbar_menu--autre navbar_menu--size navbar_space_box_menu">
                    <p>Autre</p>
                </div>
            </div>
            <div class="navbar_menu--deco">
                <a href=""><img src="/deco.png" height="80px" alt="deconnection" /></a>
            </div>
        </div>
        <div class="box_modal_joueur">
            <div class="box_modal_ligne_un">
                <div class="box_modal_un_joueur box_nookphone">
                    <h4 class="taille_texte">Joueur</h4>
                    <div class="box_taille_texte">
                        <p class="box_joueur_nom_presentation_nom box_joueur_taille_para"> Nom du joueur : <c:out value="${nom}" /> </p>
                        <p class="box_joueur_nom_presentation_prenom box_joueur_taille_para"> Prenom du joueur : <c:out value="${prenom}"/> </p>
                        <p class="box_joueur_nom_presentation_mail box_joueur_taille_para"> Mail du joueur : <br><c:out value="${mail}"/> </p>
                    </div>
                    <div class="container">  
                        <!-- Trigger the modal with a button -->  
                        <button type="button" class="button_modif--joueur btn btn-info btn-lg" data-toggle="modal" data-target="#myModal_joueur">Modifié</button>            
                    </div>
                </div>
                <div class="box_modal_un_lieu box_modal_marginLeft box_nookphone">
                    <h4 class="taille_texte_lieu">Lieu</h4>
                    <div class="box_taille_texte">
                        <p class="box_archipel_nom box_joueur_taille_para">Nom de l'archipel : <c:out value="${Nom_archipel}" /> </p>
                        <p class="box_archipel_Localisation box_joueur_taille_para"> Lieu de l'archipel : <c:out value="${Localisation_archipel}" /> </p>
                    </div>
                    <div class="container">  
                        <!-- Trigger the modal with a button -->  
                        <button type="button" class="button_modif--lieu btn btn-info btn-lg" data-toggle="modal" data-target="#myModal_lieu">Modifié</button>            
                    </div>
                </div>
                <div class="box_modal_un_batiment box_modal_marginLeft box_nookphone">
                    <h4 class="taille_texte">Batiment</h4>
                    <div class="box_taille_texte">
                        <p class="box_batiment_nom box_joueur_taille_para">Nom du batiment : <c:out value="${Nom_batiment}" /></p>
                    </div>
                    <div class="container">  
                        <!-- Trigger the modal with a button -->  
                        <button type="button" class="button_modif--batiment btn btn-info btn-lg" data-toggle="modal" data-target="#myModal_batiment">Modifié</button>            
                    </div>
                </div>
            </div>
            <div class="box_modal_ligne_deux">
                <div class="box_modal_ligne_deux_foret box_nookphone">
                    <h4 class="taille_texte">Foret</h4>
                    <div class="box_taille_texte">
                        <p class="box_foret_nom box_joueur_taille_para">Nom de la foret : <c:out value="${Nom_foret}" /></p>
                        <p class="box_foret_superficie box_joueur_taille_para">Superficie foret : <c:out value="${Superficie_foret}" /> km²</p>
                    </div>
                    <div class="container">  
                        <!-- Trigger the modal with a button -->  
                        <button type="button" class="button_modif--foret btn btn-info btn-lg" data-toggle="modal" data-target="#myModal_foret">Modifié</button>            
                    </div>
                </div>
                <div class="box_modal_ligne_deux_autre box_modal_marginLeft box_nookphone">
                    <h4 class="taille_texte">A venir</h4>
                    <div class="box_taille_texte">
                        <p>Prochainement .. </p>
                    </div>
                </div>
                <div class="box_modal_ligne_deux_autre box_modal_marginLeft box_nookphone">
                    <h4 class="taille_texte">A venir</h4>
                    <div class="box_taille_texte">
                        <p>Prochainement .. </p>
                    </div>
                </div>
            </div>
        </div>
         <!-- Modal Joueur -->  
        <div class="modal fade" id="myModal_joueur" role="dialog">  
            <div class="modal-dialog">  
                <!-- Modal content-->  
                <div class="modal-content">  
                    <div class="modal-header">  
                        <h4 class="modal-title">Modification du Joueur</h4>  
                    </div>  
                    <div class="modal-body">  
                        <div class="modal_div_nom">
                            <p class="modal_padding_para">Nom: </p>
                            <input type="text" placeholder="${nom}" class="modal_padding_input">
                        </div>
                        <div class="modal_div_prenom">
                            <p class="modal_padding_para">Prenom: </p>
                            <input type="text" placeholder="${prenom}" class="modal_padding_input">
                        </div>
                        <div class="modal_div_mail">
                            <p class="modal_padding_para">Mail: </p>
                            <input type="text" placeholder="${mail}" class="modal_padding_input">
                        </div>
                    </div>  
                    <div class="modal-footer">  
                        <button type="submit" class="btn btn-info" data-toggle="modal" data-target="#result_joueur" data-dismiss="modal">Modifié</button>
                        <button type="button" class="btn btn-default" data-dismiss="modal">Close</button>  
                    </div>  
                </div>  
            </div> 
        </div> 
        <div class="container">
            <div class="modal fade" id="result_joueur" role="dialog">
                <div class="modal-dialog">
                    <div class="modal-content">
                        <div class="modal-header">
                            <h4>Resultat Modification</h4>
                        </div>
                        <div class="modal-body">
                            <p>La modification à ..</p>
                        </div>
                        <div class="modal-footer">
                            <button type="button" class="btn btn-default" data-dismiss="modal">Close</button>  
                        </div>
                    </div>
                </div>
            </div>
        </div>
          <!-- Modal Lieu -->  
          <div class="modal fade" id="myModal_lieu" role="dialog">  
            <div class="modal-dialog">  
                <!-- Modal content-->  
                <div class="modal-content">  
                    <div class="modal-header">  
                        <h4 class="modal-title">Modification du Lieu</h4>  
                    </div>  
                    <form method="POST" action="updateJoueur">
                        <div class="modal-body">  
                            <div class="modal_div_nom_lieu">
                                <p class="modal_padding_para">Nom: </p>
                                <input type="text" placeholder="${Nom_archipel}" class="modal_padding_input">
                            </div>
                            <div class="modal_div_lieu">
                                <p class="modal_padding_para">Lieu: </p>
                                <input type="text" placeholder="${Localisation_archipel}" class="modal_padding_input">
                            </div>
                        </div>  
                        <div class="modal-footer">  
                            <button type="submit" class="btn btn-info" data-toggle="modal" data-target="#result_lieu" data-dismiss="modal">Modifié</button>
                            <button type="button" class="btn btn-default" data-dismiss="modal">Close</button>  
                        </div>  
                    </form>
                </div>  
            </div> 
        </div> 
        <div class="container">
            <div class="modal fade" id="result_lieu" role="dialog">
                <div class="modal-dialog">
                    <div class="modal-content">
                        <div class="modal-header">
                            <h4>Resultat Modification</h4>
                        </div>
                        <div class="modal-body">
                            <p>La modification à ..</p>
                        </div>
                        <div class="modal-footer">
                            <button type="button" class="btn btn-default" data-dismiss="modal">Close</button>  
                        </div>
                    </div>
                </div>
            </div>
        </div>
        <!-- Modal batiment -->  
        <div class="modal fade" id="myModal_batiment" role="dialog">  
            <div class="modal-dialog">  
                <!-- Modal content-->  
                <div class="modal-content">  
                    <div class="modal-header">  
                        <h4 class="modal-title">Modification des Batiments</h4>  
                    </div>  
                    <div class="modal-body">  
                        <div class="modal_div_nom_batiment">
                            <p class="modal_padding_para">Nom: </p>
                            <input type="text" placeholder="${Nom_batiment}" class="modal_padding_input">
                        </div>
                    </div>  
                    <div class="modal-footer">  
                        <button type="submit" class="btn btn-info" data-toggle="modal" data-target="#result_batiment" data-dismiss="modal">Modifié</button>
                        <button type="button" class="btn btn-default" data-dismiss="modal">Close</button>  
                    </div>  
                </div>  
            </div> 
        </div> 
        <div class="container">
            <div class="modal fade" id="result_batiment" role="dialog">
                <div class="modal-dialog">
                    <div class="modal-content">
                        <div class="modal-header">
                            <h4>Resultat Modification</h4>
                        </div>
                        <div class="modal-body">
                            <p>La modification à ..</p>
                        </div>
                        <div class="modal-footer">
                            <button type="button" class="btn btn-default" data-dismiss="modal">Close</button>  
                        </div>
                    </div>
                </div>
            </div>
        </div>
        <!-- Modal foret -->  
        <div class="modal fade" id="myModal_foret" role="dialog">  
            <div class="modal-dialog">  
                <!-- Modal content-->  
                <div class="modal-content">  
                    <div class="modal-header">  
                        <h4 class="modal-title">Modification du Foret</h4>  
                    </div>  
                    <div class="modal-body">  
                        <div class="modal_div_nom_foret">
                            <p class="modal_padding_para">Nom: </p>
                            <input type="text" placeholder="${Nom_foret}" class="modal_padding_input">
                        </div>
                        <div class="modal_div_lieu">
                            <p class="modal_padding_para">Superficie: </p>
                            <input type="text" placeholder="${Superficie_foret}"class="modal_padding_input">
                        </div>
                    </div>  
                    <div class="modal-footer">  
                        <button type="submit" class="btn btn-info" data-toggle="modal" data-target="#result_foret" data-dismiss="modal">Modifié</button>
                        <button type="button" class="btn btn-default" data-dismiss="modal">Close</button>  
                    </div>  
                </div>  
            </div> 
        </div> 
        <div class="container">
            <div class="modal fade" id="result_foret" role="dialog">
                <div class="modal-dialog">
                    <div class="modal-content">
                        <div class="modal-header">
                            <h4>Resultat Modification</h4>
                        </div>
                        <div class="modal-body">
                            <p>La modification à ..</p>
                        </div>
                        <div class="modal-footer">
                            <button type="button" class="btn btn-default" data-dismiss="modal">Close</button>  
                        </div>
                    </div>
                </div>
            </div>
        </div>
        <script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
        <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/js/bootstrap.min.js" integrity="sha384-ChfqqxuZUCnJSK3+MXmPNIyE6ZbWh2IMqE241rYiqJxyMiZ6OW/JmZQ5stwEULTy" crossorigin="anonymous"></script>
    </body>
</html>