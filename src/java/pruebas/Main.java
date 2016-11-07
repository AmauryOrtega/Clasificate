/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pruebas;

import Modelo.Persistencia.baseDatos.BaseDeDatos;
import modelo.persistencia.Equipo;
import modelo.persistencia.Registro;

/**
 *
 * @author Amaury Ortega
 */
public class Main {

    public static void main(String[] args) {
        BaseDeDatos bd = new BaseDeDatos();

        //Registro a = Registro.getInstance();
        Registro.getInstance();
        System.out.println("Registro: "+Registro.getInstance().getEquipos().size());
        Registro.getInstance().getEquipos().add(bd.buscar(1));
        System.out.println("Registro: "+Registro.getInstance().getEquipos().size());
        
        for(int i=0;i<Registro.getInstance().getEquipos().size();i++){
            System.out.println(Registro.getInstance().getEquipos().get(i).getNombre());
        }
        
        for(int i=0;i<Registro.getInstance().getEquipos().size();i++){
            System.out.println(Registro.getInstance().getEquipos().get(i));
        }
        
        try {
            System.out.println("Equipo.nombre: " + Registro.getInstance().buscar(1).getNombre());
        } catch (NullPointerException ex) {
            System.out.println("No existe el equipo con id " + 1);
        }
    }
}
