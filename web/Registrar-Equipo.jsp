<%-- 
    Document   : Registrar-Equipo
    Created on : 8/11/2016, 10:33:02 PM
    Author     : Julian
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="es">
    <head>
        <link rel="icon" href="img/favicon.png" type="imagen/png ">
        <title>CLASIFICATE</title>
        <meta charset="utf-8" />
        <link rel="stylesheet" type="text/css" href="css/style.css" />
        <meta name="viewport" content="width-device-width, initial-scale=1.0">
        <meta name="viewport" content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">   
        <script type="text/javascript" src="js/validaciones.js"></script>

    </head>
    <body>
        <header id="main-header">

            <a id="logo-header" href="index.jsp">
                <div class="logot"><img src="img/logotipo.png">
                    <span class="site-name">CLASIFICATE</span>
                </div>		
            </a> 
        </header>

        <section class="body">
            <header class="main-header">
                <div class="logo"><center><img  src="img/logoR.png"></center></div>
                <hr></hr>
            </header>
            <hr></hr>
        </section>
        <div class="contenedor">
            <form action="registrarinfobasicaequipo" name="form" method="post">
                <div>
                    <label for="name">Nombre de Equipo</label>
                    <input type="text" id="nombre" name="txtNombre" required/>
                </div>
                <div>
                    <label for="nationality">Nacion&aacutelidad </label>
                    <input type="text" id="nacio" name="txtNacionalidad" pattern="[A-Za-z ]{1,30}" required />
                </div>
                <div class="botones">
                    <div class= "boton" ><center><button type="submit">Siguiente</button><br></center></div>
                    <div class= "boton"><center><button><a href="index.jsp">Cancelar</button></center></div>
                </div>
            </form>
        </div> 
        <footer id="main-footer">
            <p> 2016 &copy; Clasificate<br>
                Desarroladores: Amaury Ortega, Jenniffer Alvarez, Julian Martinez<br>
                Docente: Martin Monroy Rios<br>
                Universidad de Cartagena.<br>
                Ingenieria de Sistemas
            </p>
        </footer> 
    </body>
</html>
