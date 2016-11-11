<%-- 
    Document   : exitoJugador
    Created on : 9/11/2016, 01:49:58 PM
    Author     : Julian
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>

<html lang="es">
    <head>
        <link rel="icon" href="img/favicon.png" type="imagen/png ">
        <title>CLASIFICATE- Confirmacion</title>
        <meta charset="utf-8" />
        <META HTTP-EQUIV="REFRESH" CONTENT="5;URL=Registrar-Jugador.jsp">
        <link rel="stylesheet" type="text/css" href="css/style.css" />
        <script type="text/javascript" src="js/jquery-3.1.1.min.js"></script>
        <meta name="viewport" content="width-device-width, initial-scale=1.0">
    </head>
    <body>
        <header id="main-header">

            <a id="logo-header" href="#">
                <div class="logot"><img src="img/logotipo.png">
                    <span class="site-name">CLASIFICATE</span>
                </div>		
            </a> 
        </header>


        <br><section class="body">
            <div class="logo"><center><img  src="img/logo.png"></center></div>
            <hr></hr>
            <%-- Mensaje a modificar --%> 
            <center>EL JUGADOR HA SIDO REGISTRADO CON EXITO</center>
            <center>POR FAVOR ESPERE UNOS SEGUNDOS</center>

            <hr></hr> 

        </section>

        <footer id="main-footer">
            <p> 2016 &copy; Clasificate<br>
                Desarroladores: Amaury Ortega, Jenniffer Alvarez, Julian Martinez<br>
                Docente: Martin Monroy Rios<br>
                Universidad de Cartagena.<br>
                Ingenieria de Sistemas</p>
        </footer> 
    </body>

</html>

<script>
  setTimeout(function() {
      document.location = "Registrar-Jugador.jsp";
  }, 3000); // <-- this is the delay in milliseconds
</script>