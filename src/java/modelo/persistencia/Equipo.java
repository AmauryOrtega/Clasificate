package modelo.persistencia;

import java.util.ArrayList;

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
        jugadores = new ArrayList<Jugador>();
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
        String salida = "Equipo{" + "id=" + id + ", nombre=" + nombre + ", nacionalidad=" + nacionalidad + "\n";
        for (int i = 0; i < jugadores.size(); i++) {
            salida += "Jugador #" + i + " " + jugadores.get(i) + "\n";
        }
        return salida + '}';
    }

    public boolean agregarJugador(Jugador jugador) {
        this.jugadores.add(jugador);
        return true;
    }

    @Override
    public void finalize() throws Throwable {
        for (int i = 0; i < jugadores.size(); i++) {
            jugadores.get(i).getMediciones().finalize();
            jugadores.get(i).finalize();
        }
        super.finalize();
    }

}
