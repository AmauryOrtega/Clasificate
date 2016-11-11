<%-- 
    Document   : index
    Created on : 8/11/2016, 10:26:01 PM
    Author     : Julian
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>

<html lang="en">
    <head>
        <link rel="icon" href="img/favicon.png" type="imagen/png ">
        <title>CLASIFICATE</title>
        <meta charset="utf-8" />
        <link rel="stylesheet" type="text/css" href="css/style.css" />
        <meta name="viewport" content="width-device-width, initial-scale=1.0">
        <meta name="viewport" content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
    </head>
    <body>
        <header id="main-header">

            <a id="logo-header" href="index.jsp">
                <div class="logot"><img src="img/logotipo.png">
                    <span class="site-name">CLASIFICATE</span>
                </div>		
            </a> 
        </header>

        <section  class="body" id="main-content" >	


            <P><div class="logo"><center><img  src="img/logo.png"></center></div>
            <hr></hr>
            Clasifícate. Software capaz recibir registros de equipos de baloncesto con información básica del equipo y los jugadores, además de las mediciones de pruebas físico técnicas de los jugadores. El software clasificará los jugadores comparando las mediciones de las pruebas físico técnicas con una escala para cada prueba para así dar una descripción del estado físico del jugador.
            <hr></hr>    

        </section> 



        <div class="botones">
            <div class= "boton" ><center> <button type="submit"><a href="Registrar-Equipo.jsp">Registrar Equipo</a></button></center></div>

            <div class= "boton"><center><button type="submit"><a href="Generar-Reporte.jsp">Generar Reporte </a></button></center></div>
        </div>


        <footer id="main-footer">

            <p> 2016 &copy; Clasificate<br>
                Desarroladores: Amaury Ortega, Jenniffer Alvarez, Julian Martinez<br>
                Docente: Martin Monroy Rios<br>
                Universidad de Cartagena.<br>
                Ingenieria de Sistemas</p>

        </footer>
    </body>


</html>