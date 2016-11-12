<%-- 
    Document   : Registrar-Jugador
    Created on : 8/11/2016, 10:44:19 PM
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
        <script type="text/javascript" src="js/jquery-3.1.1.min.js"></script>
        <script type="text/javascript" src="js/validaciones.js"></script>
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

        <section class="body">
            <header class="main-header">
                <div class="logo"><center><img  src="img/logoR.png"></center></div>
                <hr></hr>
            </header>
            <hr></hr>
        </section>
        <div class="contenedor">
            <form onsubmit="return validarJugador()" name="formJ">

                <div>
                    <label for="name">Nombre del Jugador</label>
                    <input type="text" size="30" id="nombrejugador" name="txtNombre" required pattern="[A-Za-z ]{1,30}"/>
                </div>
                <div>
                    <label for="identificacion">Identificacion </label>
                    <input type="text" size="30" id="id" name="txtID" required pattern="[0-9]{1,20}"/>
                </div>
                <div>
                    <label for="sexo">Sexo </label>
                    <input type="radio" name="sexo" required value="MASCULINO">Masculino
                    <input type="radio" name="sexo" required value="FEMENINO">Femenino<BR>           
                </div>                
                <div>
                    <label for="edad">Edad</label>
                    <input type="number" size="10" id="edad" name="edad" min="13" max="60" required/>
                </div>
                <hr> </hr><center>Medidas de pruebas fisico-tecnicas</center><hr></hr>
                <div>
                    <label for="cooper">Cooper (metros)</label>
                    <input type="number" step="0.01" size="10" name="txtCooper" min="0" id="metroscooper"/>               
                </div>               
                <div>
                    <label for="burpee">Burpee (cantidad)</label>
                    <input type="number" size="10" name="txtBurpee" min="0" id="cantidadburpee"/>
                </div>
                <div>
                    <label for="fuerzabrazos">Fuerza brazos (cantidad)</label>
                    <input type="number" size="10" min="0" name="txtFBrazos" id="fuerzabrazoscantidad"/>
                </div>
                <div>
                    <label for="saltoalto">Salto alto (cm) </label>
                    <input type="number" step="0.01" size="10" min="0" name="txtSAlto" id="saltoaltometros"/>
                </div>
                <div>
                    <label for="saltolargo">Salto largo (metros) </label>
                    <input type="number" step="0.01" size="10"  min="0" name="txtSLargo" id="saltolargometrosHorizontal"/>
                </div>
                <div>
                    <label for="elasticidad">Elasticidad (cantidad) </label>
                    <input type="number" min="-100" size="20" name="txtElasticidad" id="elasticidad"/>
                </div>
                <div>
                    <label for="ruffier">Ruffier (pulsos) </label>
                    P1: <input type="number" step="1" min="0" max="200" size="2" name="ruffierP1" id="ruffierP1"/>
                    p2: <input type="number" step="1" min="0" max="200" size="2" name="ruffierP2" id="ruffierP2"/>
                    p3: <input type="number" step="1" min="0" max="200" size="2" name="ruffierP3" id="ruffierP3"/>                  
                </div>               
                <div>
                    <label for="imc">IMC </label>
                    Peso(Kg): <input type="number" step="0.01" min="0" max="150" size="5" name="txtPeso" id="imcpeso"/>
                    Altura(m): <input type="number" step="0.01" min="0" max="3" size="5" name="txtAltura" id="imctalla"/>
                </div>              
                <div class="botones">
                    <div class= "boton"><center><button id="btnEnviar" type="submit" onclick="form.action='registrarjugador'">Guardar Jugador y Añadir nuevo</button></center></div>
                    <div class= "boton" ><center><button id="btnEnviar2" type="submit" onclick="form.action='registrarequipo'">Guardar Jugador y Terminar</button></center></div>                   
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
