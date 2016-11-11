package controlador;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import modelo.persistencia.Equipo;
import modelo.persistencia.Jugador;
import modelo.persistencia.Mediciones;

public class RegistrarJugador extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        //Obtencion de informacion
        String nombreJ = request.getParameter("txtNombre");
        int cedulaJ = Integer.parseInt(request.getParameter("txtID"));
        String sexoJ = request.getParameter("sexo");
        int edadJ = Integer.parseInt(request.getParameter("edad"));
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
        } catch (Exception e2) {
            response.setContentType("text/html;charset=UTF-8");
            request.getSession().setAttribute("mensaje", "Error inesperado, porfavor intente mas tarde");
            request.getRequestDispatcher("error.jsp").forward(request, response);
        }
        Jugador jugador = null;
        Equipo equipo = null;
        try {
            jugador = new Jugador(altura, cedulaJ, edadJ, new Mediciones(burpee, cooper, elasticidad, fuerzaBrazos, ruffierP1, ruffierP2, ruffierP3, saltoAlto, saltoLargo), nombreJ, peso, sexoJ);
            equipo = (Equipo) request.getSession().getAttribute("equipo");
            equipo.agregarJugador(jugador);
            request.getSession().setAttribute("equipo", equipo);
            request.getRequestDispatcher("exitoJugador.jsp").forward(request, response);
            //request.getRequestDispatcher("Registrar-Jugador.jsp").forward(request, response);
        } catch (Exception e) {
            //Mensajes de error
            request.getSession().setAttribute("mensaje", "Error inesperado, porfavor intente mas tarde");
            request.getRequestDispatcher("error.jsp").forward(request, response);
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
