package modelo.persistencia.bd;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import modelo.persistencia.Equipo;
import modelo.persistencia.Jugador;
import modelo.persistencia.Mediciones;
import modelo.persistencia.Registro;

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
    public boolean buscar(int id) {
        Statement stmt = null;
        ResultSet rs = null;
        Equipo equipo = null;
        try {
            stmt = con.createStatement();
            rs = stmt.executeQuery("select * from equipo where id=" + id);

        } catch (SQLException ex) {
            System.out.println("Error buscando equipo en bd\n" + ex.getMessage());
        }
        try {
            if (rs.next()) {
                //Existe
                try {
                    do {
                        equipo = new Equipo();
                        equipo.setNombre(rs.getString("nombre"));
                        equipo.setId(Integer.parseInt(rs.getString("id")));
                        equipo.setNacionalidad(rs.getString("nacionalidad"));
                    } while (rs.next());
                } catch (SQLException ex) {
                    System.out.println("Error recorriendo el result set al buscar el equipo en bd\n" + ex.getMessage());
                }
                //Almacenar los jugadores del equipo en equipo
                Jugador jugador = null;
                try {
                    stmt = con.createStatement();
                    rs = stmt.executeQuery("select * from jugador where idEquipo=" + id);
                } catch (SQLException ex) {
                    System.out.println("Error buscando jugadores del equipo en bd\n" + ex.getMessage());
                }
                try {
                    while (rs.next()) {
                        jugador = new Jugador();
                        Mediciones mediciones = new Mediciones(
                                Integer.parseInt(rs.getString("burpeeCantidad")),
                                Float.parseFloat(rs.getString("cooperCantidad")),
                                Integer.parseInt(rs.getString("elasticidadCantidad")),
                                Integer.parseInt(rs.getString("fuerzaBrazosCantidad")),
                                Float.parseFloat(rs.getString("ruffierP1")),
                                Float.parseFloat(rs.getString("ruffierP2")),
                                Float.parseFloat(rs.getString("ruffierP3")),
                                Float.parseFloat(rs.getString("saltoAltoDistancia")),
                                Float.parseFloat(rs.getString("saltoLargoDistancia"))
                        );
                        jugador.setNombre_completo(rs.getString("nombre_completo"));
                        jugador.setCedula(rs.getString("cedula"));
                        jugador.setSexo(rs.getString("sexo"));
                        jugador.setEdad(Integer.parseInt(rs.getString("edad")));
                        jugador.setPeso(Float.parseFloat(rs.getString("peso")));
                        jugador.setAltura(Float.parseFloat(rs.getString("altura")));
                        jugador.setMediciones(mediciones);
                        equipo.agregarJugador(jugador);
                    }
                } catch (SQLException ex) {
                    System.out.println("Error verificando si el result set esta vacio\n" + ex.getMessage());
                }
                Registro.getInstance().getEquipos().add(equipo);
                return true;
            } else {
                return false;
            }
        } catch (SQLException ex) {
            System.out.println("Error verificando si el result set esta vacio\n" + ex.getMessage());
        }
        return true;
    }

    /**
     *
     * @param equipo
     */
    public boolean registrarEquipo(Equipo equipo) {
        Statement stmt = null;
        ResultSet rs = null;

        //Almacenamiento en la BD del nuevo equipo
        try {
            stmt = con.createStatement();
            stmt.executeUpdate("INSERT INTO equipo VALUES(NULL,"
                    + "'" + equipo.getNombre() + "'" + ","
                    + "'" + equipo.getNacionalidad() + "'" + ")");
        } catch (SQLException ex) {
            System.out.println("Error en el insert sql del equipo\n" + ex.getMessage());
        }

        //Busqueda del ID del nuevo equipo para los jugadores
        try {
            stmt = con.createStatement();
            rs = stmt.executeQuery("SELECT id FROM equipo ORDER BY id DESC LIMIT 1");
        } catch (SQLException ex) {
            System.out.println("Error en la consulta sql\n" + ex.getMessage());
        }
        try {
            if (rs.next()) {
                //Hay equipos creados
                do {
                    equipo.setId(Integer.parseInt(rs.getString("id")));
                } while (rs.next());
            }
        } catch (SQLException ex) {
            System.out.println("Error recorriendo el result set del query en bd para conocer el id\n" + ex.getMessage());
        }

        //Almacenamiento en la BD de los jugadores del nuevo equipo
        try {
            stmt = con.createStatement();
            for (int i = 0; i < equipo.getJugadores().size(); i++) {
                stmt.executeUpdate("INSERT INTO jugador VALUES(NULL,"
                        + "'" + equipo.getJugadores().get(i).getCedula() + "'" + ","
                        + "'" + equipo.getJugadores().get(i).getSexo() + "'" + ","
                        + equipo.getJugadores().get(i).getEdad() + ","
                        + "'" + equipo.getJugadores().get(i).getNombre_completo() + "'" + ","
                        + equipo.getJugadores().get(i).getAltura() + ","
                        + equipo.getJugadores().get(i).getPeso() + ","
                        + equipo.getJugadores().get(i).getMediciones().getFuerzaBrazosCantidad() + ","
                        + equipo.getJugadores().get(i).getMediciones().getBurpeeCantidad() + ","
                        + equipo.getJugadores().get(i).getMediciones().getSaltoLargoDistancia() + ","
                        + equipo.getJugadores().get(i).getMediciones().getSaltoAltoDistancia() + ","
                        + equipo.getJugadores().get(i).getMediciones().getRuffierP1() + ","
                        + equipo.getJugadores().get(i).getMediciones().getRuffierP2() + ","
                        + equipo.getJugadores().get(i).getMediciones().getRuffierP3() + ","
                        + equipo.getJugadores().get(i).getMediciones().getElasticidadCantidad() + ","
                        + equipo.getJugadores().get(i).getMediciones().getCooperDistancia() + ","
                        + equipo.getId()
                        + ")");
            }
        } catch (SQLException ex) {
            System.out.println("Error en el insert sql de los jugadores\n" + ex.getMessage());
        }
        return true;
    }

}//end BaseDeDatos
