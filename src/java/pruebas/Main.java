/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pruebas;

import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import modelo.generarReporte.Reporte;
import modelo.persistencia.bd.BaseDeDatos;
import modelo.persistencia.Equipo;
import modelo.persistencia.Jugador;
import modelo.persistencia.Mediciones;
import modelo.persistencia.Registro;

/**
 *
 * @author Amaury Ortega
 */

/*
RegistrarEquipo

Equipo equipo = new Equipo(Parametros menos el ID)
BaseDeDatos bd = new BaseDeDatos();
bd.agregarEquipo(equipo);
equipo.getID();
 */

 /*
GenerarReporte
id = 1;
Registro.getInstance();
BaseDeDatos bd = new BaseDeDatos();
if(bd.buscar(id)){
    bd.close();
    Registro.getInstance().buscar(id);//Toma los datos del equipo para el pdf
    ArrayList<Reporte> reportes = new ArrayList<Reporte>(Registro.getInstance().buscar(id).getJugadores().size());
    for(int i=0;i<reportes.size();i++){
        reportes.get(i) = new Reporte(Registro.getInstance().buscar(id).getJugadores().get(i));
    }
    //Crear PDF

    //Elimina variables
    Registro.getInstance().getEquipos().remove(id); 
    reportes.clear();
}else{
    bd.close();
    //No existe dicho equipo;
}

 */
public class Main {

    public static void main(String[] args) {

        //Ejemplo para buscar equipo en bd
        int id = 12;
        Registro.getInstance();
        BaseDeDatos bd = new BaseDeDatos();

        if (bd.buscar(id)) {
            Equipo equipo = Registro.getInstance().buscar(id);//Toma los datos del equipo para el pdf
            System.out.println(equipo);
        }
        try{
            bd.finalize();
        }catch(Exception e){
            System.out.println(e.getMessage());
        } catch (Throwable ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        /*Ejemplo para buscar equipo
        BaseDeDatos bd = new BaseDeDatos();
        Registro.getInstance().getEquipos();

        //Evidencia registro vacio
        System.out.println("Registro: " + Registro.getInstance().getEquipos().size());
        int id = 1;        
        if (bd.buscar(id)) {
            try {
                bd.finalize();
            } catch (Throwable ex) {
                System.out.println("Error finalizando la bd\n" + ex.getMessage());;
            }
            //Evidencia registro aumentado
            System.out.println("Registro: " + Registro.getInstance().getEquipos().size());

            //Informacion en el registro
            for (int i = 0; i < Registro.getInstance().getEquipos().size(); i++) {
                System.out.println(Registro.getInstance().getEquipos().get(i));
            }
            //Equipo buscado y almacenado en el registro
            //System.out.println("Equipo almacenado en el registro: "+ Registro.getInstance().buscar(id));
        }else{
            System.out.println("No existe equipo con id "+ id);
        }
         */
 /*Ejemplo para registrar un equipo
        BaseDeDatos bd = new BaseDeDatos();
        Equipo test = new Equipo("equipo1", "colombia");
        Jugador testJ = new Jugador(2, 1143397229, 19, "amaury ortega", 70, "Masculino");
        testJ.setMediciones(new Mediciones(0, 0, 0, 0, 0, 0, 0, 0, 0));
        test.agregarJugador(testJ);
        testJ = new Jugador(2, 1143397229, 19, "amaury ortega2", 70, "Masculino");
        testJ.setMediciones(new Mediciones(1, 1, 1, 1, 1, 1, 1, 1, 1));
        test.agregarJugador(testJ);
        bd.registrarEquipo(test);
        System.out.println("El id de su equipo es " + test.getId());
         */
    }
}

/*
Mostrar info en el controlador

response.setContentType("text/html;charset=UTF-8");
try (PrintWriter out = response.getWriter()) {
    out.println("<!DOCTYPE html>");
    out.println("<html>");
    out.println("<head>");
    out.println("<title>Servlet RegistrarEquipo</title>");            
    out.println("</head>");
    out.println("<body>");
    out.println("<h1>Servlet RegistrarEquipo at " + equipo + "</h1>");
    out.println("</body>");
    out.println("</html>");
}
 */
