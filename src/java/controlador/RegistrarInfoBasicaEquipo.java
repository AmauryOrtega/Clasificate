/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import modelo.persistencia.Equipo;

/**
 *
 * @author Amaury Ortega
 */
public class RegistrarInfoBasicaEquipo extends HttpServlet {

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
        //Validar que los campos que vienen no esten en blanco
        //nombreEquipo = request.getParameter("txtNombre");
//        int ed = 0;
//        try {
//            ed = Integer.parseInt(edad);
//        } catch (NumberFormatException ex) {
//            request.getRequestDispatcher("errornumero.jsp").forward(request, response);
//        }

        //Guardar variable en sesion
        //Equipo equipo = new Equipo(...);
        //request.getSession().setAttribute("equipo", equipo);
        String nombreEquipo = "NombreEquipo";
        String nacionalidad = "Nacionalidad";
        Equipo equipo = new Equipo(nombreEquipo, nacionalidad);
        request.getSession().setAttribute("equipo", equipo);
        //request.getRequestDispatcher("registrarjugador").forward(request, response);
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
