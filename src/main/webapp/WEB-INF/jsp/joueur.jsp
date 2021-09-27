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
                <form method="POST" action="identification/archipel">
                    <input type="hidden" name="id_joueur" value="<c:out value="${id_joueur}" />" />
                    <button type="submit"><p>Joueur</p></a>
                </form>
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
        <div class="box_joueur">
                <div class="box_joueur_presentation">
                <p class="box_joueur_nom_presentation_nom"> Nom du joueur : <c:out value="${nom}" /> </p>
                <p class="box_joueur_nom_presentation_prenom"> Prenom du joueur : <c:out value="${prenom}"/> </p>
                <p class="box_joueur_nom_presentation_mail"> Mail du joueur : <c:out value="${mail}"/> </p>
            </div>
            <div class="box_archipel">
                <p class="box_archipel_nom"> Nom de l'archipel : <c:out value="${Nom_archipel}" /> </p>
                <p class="box_archipel_Localisation"> Lieu de l'archipel : <c:out value="${Localisation_archipel}" /> </p>

            </div>
        </div>
    </body>
</html>