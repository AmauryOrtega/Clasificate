package Modelo.Persistencia.baseDatos;

/**
 * @author Amaury Ortega
 * @version 1.0
 * @created 07-Nov.-2016 1:15:37 p. m.
 */
public class Conexion {

	private static String CLASSNAME;
	public java.sql.Connection con;
	private static String DATABASE;
	private static String HOST;
	private static String PASSWORD;
	private static String PORT;
	private static String URL;
	private static String USERNAME;

	public Conexion(){

	}

	public void finalize() throws Throwable {

	}

}//end Conexion