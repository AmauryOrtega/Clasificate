/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo.persistencia;

import java.util.ArrayList;

/**
 *
 * @author Amaury Ortega
 */
public class Registro {

    private ArrayList<Equipo> equipos;
    private static Registro instance = null;

    private Registro() {
        equipos = new ArrayList<Equipo>();
    }

    public static Registro getInstance() {
        if (Registro.instance == null) {
            Registro.instance = new Registro();
        } else {

        }
        return Registro.instance;
    }

    public ArrayList<Equipo> getEquipos() {
        return equipos;
    }

    public void setEquipos(ArrayList<Equipo> equipos) {
        this.equipos = equipos;
    }

    public Equipo buscar(int id) {
        for (int i = 0; i < Registro.instance.equipos.size(); i++) {
            if (Registro.instance.equipos.get(i).getId() == id) {
                return Registro.instance.equipos.get(i);
            }
        }
        return null;
    }
}
