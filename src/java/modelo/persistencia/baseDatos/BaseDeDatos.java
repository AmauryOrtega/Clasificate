package Modelo.Persistencia.baseDatos;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import modelo.persistencia.Equipo;

/**
 * @author Amaury Ortega
 * @version 1.0
 * @created 07-Nov.-2016 1:15:34 p. m.
 */
public class BaseDeDatos extends Conexion {

    public BaseDeDatos() {
        super();
    }

    public void finalize() throws Throwable {
        super.finalize();
        try {
            con.close();
        } catch (SQLException ex) {
            System.out.println("Error cerrando la conexion sql\n" + ex.getMessage());
        }
    }

    /**
     *
     * @param id
     */
    public Equipo buscar(int id) {
        Statement stmt = null;
        ResultSet rs = null;
        Equipo equipo = null;
        try {
            stmt = con.createStatement();
            rs = stmt.executeQuery("select * from equipo where id=" + id);

        } catch (SQLException ex) {
            System.out.println("Error buscando equipo en bd\n" + ex.getMessage());
        }
        if (rs == null) {
            //No existe
            return equipo;
        } else {
            //Si existe
            try {
                while (rs.next()) {
                    equipo = new Equipo();
                    equipo.setNombre(rs.getString("nombre"));
                    equipo.setId(Integer.parseInt(rs.getString("id")));
                    equipo.setNacionalidad(rs.getString("nacionalidad"));
                    //Almacenar los jugadores del equipo en equipo
                }
            } catch (SQLException ex) {
                System.out.println("Error recorriendo el result set al buscar el equipo en bd\n" + ex.getMessage());
            }
        }
        return equipo;
    }

    /**
     *
     * @param equipo
     */
    public boolean registrarEquipo(Equipo equipo) {
        Statement stmt = null;
        ResultSet rs = null;
        //Busqueda del ID a asignar al nuevo equipo a registrar
        try {
            stmt = con.createStatement();
            rs = stmt.executeQuery("SELECT id FROM equipo ORDER BY id DESC LIMIT 1");
        } catch (SQLException ex) {
            System.out.println("Error en la consulta sql\n" + ex.getMessage());
        }
        if (rs == null) {
            //No hay equipos creados
            equipo.setId(0);
        } else {
            try {
                while (rs.next()) {
                    equipo.setId(Integer.parseInt(rs.getString("id")) + 1);
                }
            } catch (SQLException ex) {
                System.out.println("Error recorriendo el result set del query en bd\n" + ex.getMessage());
            }
        }
        
        //Almacenamiento en la BD del nuevo equipo
        try{
            stmt = con.createStatement();
            rs = stmt.executeQuery("INSERT INTO equipo VALUES("
                    + equipo.getId() + ","
                    + equipo.getNombre() + ","
                    + equipo.getNacionalidad() + ")");
        } catch (SQLException ex) {
            System.out.println("Error en el insert sql del equipo\n" + ex.getMessage());
        }
        //Almacenamiento en la BD de los jugadores del nuevo equipo
        try {
            stmt = con.createStatement();
            for (int i = 0; i < equipo.getJugadores().size(); i++) {
                stmt.executeQuery("INSERT INTO jugador VALUES(NULL,"
                        + equipo.getJugadores().get(i).getCedula() + ","
                        + equipo.getJugadores().get(i).getSexo()+ ","
                        + equipo.getJugadores().get(i).getEdad()+ ","
                        + equipo.getJugadores().get(i).getNombre_completo()+ ","
                        + equipo.getJugadores().get(i).getPeso()+ ","
                        + equipo.getJugadores().get(i).getMediciones().getFuerzaBrazosCantidad()+ ","
                        + equipo.getJugadores().get(i).getMediciones().getBurpeeCantidad()+ ","
                        + equipo.getJugadores().get(i).getMediciones().getSaltoLargoDistancia()+ ","
                        + equipo.getJugadores().get(i).getMediciones().getSaltoAltoDistancia()+ ","
                        + equipo.getJugadores().get(i).getMediciones().getRuffierP1()+ ","
                        + equipo.getJugadores().get(i).getMediciones().getRuffierP2()+ ","
                        + equipo.getJugadores().get(i).getMediciones().getRuffierP3()+ ","
                        + equipo.getJugadores().get(i).getMediciones().getElasticidadCantidad()+ ","
                        + equipo.getJugadores().get(i).getMediciones().getCooperDistancia()+ ","
                        + equipo.getId()
                        +")");
            }
        } catch (SQLException ex) {
            System.out.println("Error en el insert sql de los jugadores\n" + ex.getMessage());
        }
        return true;
    }

}//end BaseDeDatos
