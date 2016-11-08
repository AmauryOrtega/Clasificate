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
public class Equipo {

    private int id;
    private ArrayList<Jugador> jugadores;
    private String nombre;
    private String nacionalidad;

    public Equipo() {
        jugadores = new ArrayList<Jugador>();
    }

    public Equipo(ArrayList<Jugador> jugadores, String nombre, String nacionalidad) {
        this.jugadores = jugadores;
        this.nombre = nombre;
        this.nacionalidad = nacionalidad;
    }

    public Equipo(String nombre, String nacionalidad) {
        this.nombre = nombre;
        this.nacionalidad = nacionalidad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public ArrayList<Jugador> getJugadores() {
        return jugadores;
    }

    public void setJugadores(ArrayList<Jugador> jugadores) {
        this.jugadores = jugadores;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    @Override
    public String toString() {
        return "Equipo{" + "id=" + id + ", jugadores=" + jugadores + ", nombre=" + nombre + ", nacionalidad=" + nacionalidad + '}';
    }
    
    public boolean agregarJugador(Jugador jugador){
        this.jugadores.add(jugador);
        return true;
    }

    @Override
    protected void finalize() throws Throwable {
        for(int i=0;i<jugadores.size();i++){
            jugadores.get(i).getMediciones().finalize();
            jugadores.get(i).finalize();
        }
        super.finalize();
    }

    
}
