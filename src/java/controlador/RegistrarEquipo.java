package controlador;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import modelo.persistencia.Equipo;
import modelo.persistencia.Jugador;
import modelo.persistencia.Mediciones;
import modelo.persistencia.bd.BaseDeDatos;

public class RegistrarEquipo extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String nombreJ = "";
        String cedulaJ = "";
        String sexoJ = "";
        int edadJ = 0;
        float cooper = 0;
        int burpee = 0;
        int fuerzaBrazos = 0;
        float saltoAlto = 0;
        float saltoLargo = 0;
        float ruffierP1 = 0;
        float ruffierP2 = 0;
        float ruffierP3 = 0;
        float peso = 0;
        float altura = 0;
        int elasticidad = 0;

        try {
            //Obtencion de informacion
            nombreJ = request.getParameter("txtNombre");
            cedulaJ = request.getParameter("txtID");
            sexoJ = request.getParameter("sexo");
            edadJ = Integer.parseInt(request.getParameter("edad"));

            try {
                cooper = Float.parseFloat(request.getParameter("txtCooper"));//.replace(',', '.'));
                burpee = Integer.parseInt(request.getParameter("txtBurpee"));
                fuerzaBrazos = Integer.parseInt(request.getParameter("txtFBrazos"));
                saltoAlto = Float.parseFloat(request.getParameter("txtSAlto"));//.replace(',', '.'));;
                saltoLargo = Float.parseFloat(request.getParameter("txtSLargo"));//.replace(',', '.'));
                ruffierP1 = Float.parseFloat(request.getParameter("ruffierP1"));
                ruffierP2 = Float.parseFloat(request.getParameter("ruffierP2"));
                ruffierP3 = Float.parseFloat(request.getParameter("ruffierP3"));
                peso = Float.parseFloat(request.getParameter("txtPeso"));//.replace(',', '.'));
                altura = Float.parseFloat(request.getParameter("txtAltura"));//.replace(',', '.'));
                elasticidad = Integer.parseInt(request.getParameter("txtElasticidad"));
            } catch (NumberFormatException e) {
                //Error en comas
                try {
                    cooper = Float.parseFloat(request.getParameter("txtCooper"));
                } catch (NumberFormatException e1) {
                    cooper = Float.parseFloat(request.getParameter("txtCooper").replace(',', '.'));
                }
                try {
                    saltoAlto = Float.parseFloat(request.getParameter("txtSAlto"));
                } catch (NumberFormatException e1) {
                    saltoAlto = Float.parseFloat(request.getParameter("txtSAlto").replace(',', '.'));
                }
                try {
                    saltoLargo = Float.parseFloat(request.getParameter("txtSLargo"));
                } catch (NumberFormatException e1) {
                    saltoLargo = Float.parseFloat(request.getParameter("txtSLargo").replace(',', '.'));
                }
                try {
                    peso = Float.parseFloat(request.getParameter("txtPeso"));
                } catch (NumberFormatException e1) {
                    peso = Float.parseFloat(request.getParameter("txtPeso").replace(',', '.'));
                }
                try {
                    altura = Float.parseFloat(request.getParameter("txtAltura"));
                } catch (NumberFormatException e1) {
                    altura = Float.parseFloat(request.getParameter("txtAltura").replace(',', '.'));
                }
            }
            //Fin Obtencion de informacion

            Jugador jugador = null;
            Equipo equipo = null;
            try {
                jugador = new Jugador(altura, cedulaJ, edadJ, new Mediciones(burpee, cooper, elasticidad, fuerzaBrazos, ruffierP1, ruffierP2, ruffierP3, saltoAlto, saltoLargo), nombreJ, peso, sexoJ);
                equipo = (Equipo) request.getSession().getAttribute("equipo");
                equipo.agregarJugador(jugador);
            } catch (Exception e) {
                //Mensajes de error
                request.getSession().setAttribute("mensaje", "Hubo un problema obteniendo los datos del jugador a crear");
                request.getRequestDispatcher("error.jsp").forward(request, response);
            } catch (Throwable ex) {
                //Mensajes de error
                request.getSession().setAttribute("mensaje", "Hubo un problema obteniendo los datos del jugador a crear");
                request.getRequestDispatcher("error.jsp").forward(request, response);
            }

            //Almacenado BD
            try {
                BaseDeDatos bd = new BaseDeDatos();
                bd.registrarEquipo(equipo);
                equipo.finalize();
                bd.finalize();
            } catch (Exception e) {
                //Mensajes de error
                request.getSession().setAttribute("mensaje", "Hubo un problema con la base de datos, porfavor pruebe mas tarde");
                request.getRequestDispatcher("error.jsp").forward(request, response);
            } catch (Throwable ex) {
                response.setContentType("text/html;charset=UTF-8");
                request.getSession().setAttribute("mensaje", "Hubo un problema con la base de datos, porfavor pruebe mas tarde");
                request.getRequestDispatcher("error.jsp").forward(request, response);
            }

            //ID
            request.getSession().setAttribute("id", equipo.getId());
            request.getRequestDispatcher("ok.jsp").forward(request, response);
            try {
                // Eliminar variables
                equipo.finalize();
                request.getSession().removeAttribute("equipo");
            } catch (Throwable ex) {
                request.getSession().setAttribute("mensaje", "Hubo un problema elimiando valores de sesion, porfavor pruebe mas tarde");
                request.getRequestDispatcher("error.jsp").forward(request, response);
            }
        } catch (Exception avoid) {
            request.getRequestDispatcher("index.jsp").forward(request, response);
        }

    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
