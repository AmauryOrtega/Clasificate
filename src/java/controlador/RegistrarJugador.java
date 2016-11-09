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

/**
 *
 * @author Amaury Ortega
 */
public class RegistrarJugador extends HttpServlet {

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
        String nombreJ = "nombre jugador";
        int cedulaJ = 123456789;
        String sexoJ = "MASCULINO";
        int edadJ = 19;
        float cooper = 1900;
        int burpee = 25;
        int fuerzaBrazos = 25;
        float saltoAlto = 56;
        float saltoLargo = 2.0f;
        float ruffierP1 = 100;
        float ruffierP2 = 100;
        float ruffierP3 = 50;
        float peso = 76;
        float altura = 2;
        int elasticidad = 6;

        Jugador jugador = new Jugador(altura, cedulaJ, edadJ, new Mediciones(burpee, cooper, elasticidad, fuerzaBrazos, ruffierP1, ruffierP2, ruffierP3, saltoAlto, saltoLargo), nombreJ, peso, sexoJ);
        Equipo equipo = (Equipo)request.getSession().getAttribute("equipo");
        equipo.agregarJugador(jugador);
        request.getSession().setAttribute("equipo", equipo);
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
