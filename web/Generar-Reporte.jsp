<%-- 
    Document   : Generar-Reporte
    Created on : 11/11/2016, 01:31:16 PM
    Author     : Amaury Ortega
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
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

            <a id="logo-header" href="#">
                <div class="logot"><img src="img/logotipo.png">
                    <span class="site-name">CLASIFICATE</span>
                </div>		
            </a> 
        </header>


        <p> <section  class="body" >
            <div class="logo"><center><img  src="img/logoG.png"></center></div>
            <P><hr></hr>
            <center>GENERAR REPORTE </center>
            <hr></hr>   

        </section>

        <div class="contenedor">
            <form  action="generarreporte">

                <div>
                    <label for="generarreporte">ID del Equipo</label>
                    <input type="text" size="30" id="idEquipo" name="idEquipo" pattern="\d+" required />
                </div>
                <div class="botones">
                    <div class= "boton" ><center> <button type="submit">Generar Reporte</button></center></div>

                    <div class= "boton"><center><button type="submit"><a href="index.jsp">Cancelar</a></button></center></div>
                </div>
            </form>
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
