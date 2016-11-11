<%-- 
    Document   : ok
    Created on : 10/11/2016, 09:06:05 PM
    Author     : Amaury Ortega
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%
    Integer id = (Integer)request.getSession().getAttribute("id");
%>
<!DOCTYPE html>
<html lang="en">
    <head>
        <title>CLASIFICATE- Confirmacion</title>
        <meta charset="utf-8" />

        <link rel="stylesheet" type="text/css" href="css/style.css" />
        <meta name="viewport" content="width-device-width, initial-scale=1.0">
    </head>
    <body class="body">
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

            <center>EL EQUIPO HA SIDO REGISTRADO CON EXITO.</center>
            <center>SU ID ES <%=id%></center>

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
    request.getSession().removeAttribute("id");
%>
