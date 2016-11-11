/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.awt.Graphics2D;
import java.awt.print.PageFormat;
import java.awt.print.Paper;
import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.qoppa.pdfWriter.PDFDocument;
import com.qoppa.pdfWriter.PDFPage;
import java.io.PrintWriter;
import java.util.ArrayList;
import modelo.generarReporte.Reporte;
import modelo.persistencia.Equipo;
import modelo.persistencia.Registro;
import modelo.persistencia.bd.BaseDeDatos;
import sun.reflect.generics.visitor.Reifier;

/**
 *
 * @author Amaury Ortega
 */
public class GenerarReporte extends HttpServlet {

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
        try {
            Registro.getInstance();
            String id = request.getParameter("idEquipo");
            Equipo equipo = null;
            try {
                BaseDeDatos bd = new BaseDeDatos();
                if (bd.buscar(Integer.parseInt(id))) {
                    equipo = Registro.getInstance().buscar(Integer.parseInt(id));
                    response.setContentType("text/html;charset=UTF-8");
                    try (PrintWriter out = response.getWriter()) {
                        out.println("<!DOCTYPE html>");
                        out.println("<html>");
                        out.println("<head>");
                        out.println("<title>Servlet RegistrarInfoBasicaEquipo</title>");
                        out.println("</head>");
                        out.println("<body>");
                        out.println("<h1>Equipo buscado</h1>");
                        out.println("<h1>" + equipo.getJugadores() + "</h1>");
                        for (int i = 0; i < equipo.getJugadores().size(); i++) {
                            out.println("<h5>" + equipo.getJugadores().get(i).getNombre_completo() + ":" + equipo.getJugadores().get(i).getCedula() + "\t" + (new Reporte(equipo.getJugadores().get(i))).toString() + "</h5>");
                        }
                        out.println("</body>");
                        out.println("</html>");
                    }
                }else{
                    //Equipo no encontrado
                    //request.getSession().setAttribute("mensaje", "El equipo buscado no existe");
                    //request.getRequestDispatcher("Error.jsp").forward(request, response); -> un timer aqui que mande a Generar-Reporte.jsp
                }
            } catch (Exception e) {
                //Error bd
                response.setContentType("text/html;charset=UTF-8");
                try (PrintWriter out = response.getWriter()) {
                    out.println("<!DOCTYPE html>");
                    out.println("<html>");
                    out.println("<head>");
                    out.println("<title>Servlet RegistrarInfoBasicaEquipo</title>");
                    out.println("</head>");
                    out.println("<body>");
                    out.println("<h1>error</h1>");
                    out.println("<h1>" + e.getMessage() + "</h1>");
                    out.println("<h5>Equipo buscado</h5>");
                    out.println("</body>");
                    out.println("</html>");
                }
            }

            //Eliminar variables
            
            
            /*PDF
            // Obteniendo output stream del servlet 
            ServletOutputStream sOut = response.getOutputStream();
            response.setContentType("application/pdf");
            response.setHeader("Content-disposition", "attachment; filename=" + "reporte ID" + id + ".pdf");

            //Crear formato de pagina para el documento            
            PageFormat pageFormat = new PageFormat();
            Paper pagina = new Paper();
            pagina.setSize(72 * 8.5, 72 * 11.0);
            pageFormat.setOrientation(PageFormat.LANDSCAPE);
            pageFormat.setPaper(pagina);

            //Crear documento y una pagina en el documento
            PDFDocument pdfDoc = new PDFDocument();
            PDFPage nuevaPagina = pdfDoc.createPage(pageFormat);

            // Draw to the page
            Graphics2D g2d = nuevaPagina.createGraphics();
            g2d.drawString("This is a PDF document created from a servlet", 100, 100);

            // Add the page to the document
            pdfDoc.addPage(nuevaPagina);

            // Save the document to the servlet output stream.  This goes directly to the browser
            pdfDoc.saveDocument(sOut);

            // Close the server output stream
            sOut.close();
             */
        } catch (Exception e) {
            //Mensajes de error
            response.setContentType("text/html;charset=UTF-8");
            try (PrintWriter out = response.getWriter()) {
                out.println("<!DOCTYPE html>");
                out.println("<html>");
                out.println("<head>");
                out.println("<title>Servlet RegistrarInfoBasicaEquipo</title>");
                out.println("</head>");
                out.println("<body>");
                out.println("<h1>Excepcion capturada " + e.getMessage() + "</h1>");
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
