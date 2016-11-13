package modelo.persistencia.bd;

import java.sql.*;

public class Conexion {

    private static String CLASSNAME = "com.mysql.jdbc.Driver";
    public java.sql.Connection con;
    private static String DATABASE = "clasificate";
    private static String HOST = "localhost";
    private static String PASSWORD = "clasificate";
    private static String PORT = "3306";
    private static String URL = "jdbc:mysql://localhost:" + PORT + "/" + DATABASE;
    private static String USERNAME = "usuario_clasificate";

    public Conexion() {
        try {
            Class.forName(CLASSNAME);
            try {
                con = DriverManager.getConnection(URL, USERNAME, PASSWORD);
            } catch (SQLException ex) {
                // log an exception. fro example:
                System.out.println(ex.getMessage());
                System.out.println("Failed to create the database connection.");
            }
        } catch (ClassNotFoundException ex) {
            // log an exception. for example:
            System.out.println("Driver not found.");
        }
    }

    public void finalize() throws Throwable {
        super.finalize();
    }

}//end Conexion
