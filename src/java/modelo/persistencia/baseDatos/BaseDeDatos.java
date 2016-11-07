package Modelo.Persistencia.baseDatos;
import modelo.persistencia.Equipo;

/**
 * @author Amaury Ortega
 * @version 1.0
 * @created 07-Nov.-2016 1:15:34 p. m.
 */
public class BaseDeDatos extends Conexion {

	public BaseDeDatos(){

	}

	public void finalize() throws Throwable {
		super.finalize();
	}

	/**
	 * 
	 * @param id
	 */
	public Equipo buscar(int id){
		return null;
	}

	/**
	 * 
	 * @param equipo
	 */
	public boolean registrarEquipo(Equipo equipo){
		return false;
	}

}//end BaseDeDatos