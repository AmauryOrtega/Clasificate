<%-- 
    Document   : error
    Created on : 11/11/2016, 01:35:33 PM
    Author     : Amaury Ortega
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%
    String mensaje = (String) request.getSession().getAttribute("mensaje");
%>
<!DOCTYPE html>
<html lang="es">
    <head>
        <link rel="icon" href="img/favicon.png" type="imagen/png ">
        <title>CLASIFICATE- Confirmacion</title>
        <meta charset="utf-8" />
        <link rel="stylesheet" type="text/css" href="css/style.css" />
        <script type="text/javascript" src="js/jquery-3.1.1.min.js"></script>
        <meta name="viewport" content="width-device-width, initial-scale=1.0">
    </head>
    <body>
        <header id="main-header">

            <a id="logo-header" href="index.jsp">
                <div class="logot"><img src="img/logotipo.png">
                    <span class="site-name">CLASIFICATE</span>
                </div>		
            </a> 
        </header>


        <br><section class="body">
            <div class="logo"><center><img  src="img/logo.png"></center></div>
            <hr></hr>
            <%-- Mensaje a modificar --%> 
            <center><%=mensaje%></center>
            <hr></hr> 

        </section>
        <div class="botones">
            <div class= "boton"><center><button><a href="index.jsp">Inicio</button></center></div>
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

<%
    request.getSession().removeAttribute("mensaje");
%>