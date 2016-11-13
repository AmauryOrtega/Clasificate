package modelo.persistencia;

import java.util.ArrayList;

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
