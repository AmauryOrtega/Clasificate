package Modelo.Persistencia.baseDatos;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
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
            try {
                while (rs.next()) {
                    equipo = new Equipo();
                    equipo.setNombre(rs.getString("nombre"));
                    equipo.setId(Integer.parseInt(rs.getString("id")));
                    equipo.setNacionalidad(rs.getString("nacionalidad"));
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
        return false;
        /*
        SELECT column_name FROM table_name ORDER BY column_name DESC LIMIT 1;
         */
    }

}//end BaseDeDatos
