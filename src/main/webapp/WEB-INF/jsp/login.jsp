<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page pageEncoding="UTF-8" %>

<!DOCTYPE html>
<html>
    <head>
        <title> Login </title>
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
        <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/css/styleLogin.css">
    </head>
    <body>
        <image class="logo" src="../logo.png"/>
        <c:if test="${verify}">
            <div class="alert alert-danger message_erreur" role="alert">
            Mauvaise information, Veuillez verifier vos information
            </div>
        </c:if>
        <form method="POST" action="identification">
            <div class="interface_menu">
                <div class="menu">
                    <h4 class="menu_titre"> 
                        Connectez-vous :
                    </h4>
                    <div class="box_nom_prenom">
                        <div class="box_nom">
                            <div class="box_nom_titre">
                                <p class="nom">
                                    Nom :
                                </p>
                            </div>
                            <div class="box_nom_input">
                                <input type="text" name="nom" id="nom">
                            </div>
                        </div>
                        <div class="box_prenom">
                            <div class="box_prenom_titre">
                                <p class="prenom">
                                    Prenom :
                                </p>
                            </div>
                            <div class="box_prenom_input">
                                <input type="text" name="prenom" id="prenom">
                            </div>
                        </div>
                        <div class="box_mail">
                            <div class="box_mail_titre">
                                <p class="mail">
                                    Mail :
                                </p>
                            </div>
                            <div class="box_mail_input">
                                <input type="text" name="mail" id="mail">
                            </div>
                        </div>
                    </div>
                                       <div class="box_boutton_message">
                        <div class="boutton">
                            <button type="submit" class="btn btn-info">Connecter</button>
                        </div>
                    </div>
                </div>
            </div>
        </form>
    </body>
</html>