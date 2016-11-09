/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
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

/**
 *
 * @author Amaury Ortega
 */
public class RegistrarEquipo extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String nombreJ = "nombre jugador2";
        int cedulaJ = 999956789;
        String sexoJ = "MASCULINO";
        int edadJ = 19;
        float cooper = 2000;
        int burpee = 30;
        int fuerzaBrazos = 30;
        float saltoAlto = 60;
        float saltoLargo = 2.5f;
        float ruffierP1 = 100;
        float ruffierP2 = 100;
        float ruffierP3 = 50;
        float peso = 80;
        float altura = 1.5f;
        int elasticidad = 5;
        Jugador jugador = new Jugador(altura, cedulaJ, edadJ, new Mediciones(burpee, cooper, elasticidad, fuerzaBrazos, ruffierP1, ruffierP2, ruffierP3, saltoAlto, saltoLargo), nombreJ, peso, sexoJ);
        Equipo equipo = (Equipo) request.getSession().getAttribute("equipo");
        equipo.agregarJugador(jugador);

        //Guardado en base de datos
        BaseDeDatos bd = new BaseDeDatos();
        bd.registrarEquipo(equipo);
        
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet RegistrarEquipo</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>El ID del equipo es " + equipo.getId() + "</h1>");
            out.println("</body>");
            out.println("</html>");
        }
        
        try {
            equipo.finalize();
        } catch (Throwable ex) {
            try (PrintWriter out = response.getWriter()) {
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet RegistrarEquipo</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Error eliminando equipo de sesion\n" + ex.getMessage() + "</h1>");
            out.println("</body>");
            out.println("</html>");
        }
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
