package controlador;

import com.itextpdf.text.BaseColor;
import com.itextpdf.text.Document;
import com.itextpdf.text.Element;
import com.itextpdf.text.Font;
import com.itextpdf.text.PageSize;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.Phrase;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;

import com.itextpdf.text.pdf.PdfWriter;
import java.io.ByteArrayOutputStream;
import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import modelo.generarReporte.Reporte;
import modelo.persistencia.Equipo;
import modelo.persistencia.Registro;
import modelo.persistencia.bd.BaseDeDatos;

public class GenerarReporte extends HttpServlet {

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
                    try {
                        bd.finalize();
                    } catch (Exception e) {
                        request.getSession().setAttribute("mensaje", "Hubo un problema con la base de datos, porfavor pruebe mas tarde");
                        request.getRequestDispatcher("error.jsp").forward(request, response);
                    } catch (Throwable ex) {
                        request.getSession().setAttribute("mensaje", "Hubo un problema con la base de datos, porfavor pruebe mas tarde");
                        request.getRequestDispatcher("error.jsp").forward(request, response);
                    }

                    //PDF
                    Document doc = new Document();
                    ByteArrayOutputStream baosPDf = new ByteArrayOutputStream();
                    PdfWriter docWriter = null;
                    docWriter = PdfWriter.getInstance(doc, baosPDf);
                    //META data
                    doc.addCreationDate();
                    doc.addTitle("Reporte para equipo con ID " + equipo.getId());
                    doc.setPageSize(PageSize.LETTER.rotate());

                    //Parrafos
                    doc.open();
                    doc.add(new Paragraph("Reporte ID(" + equipo.getId() + ")"));

                    Paragraph parrafo = new Paragraph("El equipo de balonecesto \"" + equipo.getNombre().toUpperCase() + "\" con ID \"" + equipo.getId() + "\" de nacionalidad \"" + equipo.getNacionalidad().toUpperCase() + "\"");
                    //Tamaños de fuentes
                    Font bfBold12 = new Font(Font.FontFamily.TIMES_ROMAN, 12, Font.BOLD, new BaseColor(0, 0, 0));
                    Font bf12 = new Font(Font.FontFamily.TIMES_ROMAN, 11);
                    //Ancho de columnas
                    float[] anchoColumnas = {4f, 2f, 2f, 2f, 2f, 2f, 2f, 2f, 2f};
                    //Crear tabla usando los anchos
                    PdfPTable table = new PdfPTable(anchoColumnas);
                    //Porcentaje de la pagina usado por la tabla
                    table.setWidthPercentage(95f);
                    //Cabezales de las columnas
                    insertCell(table, "Jugador(ID)", Element.ALIGN_LEFT, 1, bfBold12);
                    insertCell(table, "Burpee", Element.ALIGN_LEFT, 1, bfBold12);
                    insertCell(table, "Cooper", Element.ALIGN_LEFT, 1, bfBold12);
                    insertCell(table, "Elasticidad", Element.ALIGN_LEFT, 1, bfBold12);
                    insertCell(table, "Fuerza de Brazos", Element.ALIGN_LEFT, 1, bfBold12);
                    insertCell(table, "Ruffier", Element.ALIGN_LEFT, 1, bfBold12);
                    insertCell(table, "Salto Largo", Element.ALIGN_LEFT, 1, bfBold12);
                    insertCell(table, "Salto Alto", Element.ALIGN_LEFT, 1, bfBold12);
                    insertCell(table, "IMC", Element.ALIGN_LEFT, 1, bfBold12);
                    table.setHeaderRows(1);
                    //Insertar informacion
                    for (int i = 0; i < equipo.getJugadores().size(); i++) {
                        Reporte reporte = new Reporte(equipo.getJugadores().get(i));
                        insertCell(table, equipo.getJugadores().get(i).getNombre_completo() + " (" + equipo.getJugadores().get(i).getCedula() + ")", Element.ALIGN_LEFT, 1, bf12);
                        insertCell(table, reporte.getResultado_burpee(), Element.ALIGN_LEFT, 1, bf12);
                        insertCell(table, reporte.getResultado_cooper(), Element.ALIGN_LEFT, 1, bf12);
                        insertCell(table, reporte.getResultado_elasticidad(), Element.ALIGN_LEFT, 1, bf12);
                        insertCell(table, reporte.getResultado_fuerzaBrazos(), Element.ALIGN_LEFT, 1, bf12);
                        insertCell(table, reporte.getResultado_ruffier(), Element.ALIGN_LEFT, 1, bf12);
                        insertCell(table, reporte.getResultado_salgoLargo(), Element.ALIGN_LEFT, 1, bf12);
                        insertCell(table, reporte.getResultado_saltoAlto(), Element.ALIGN_LEFT, 1, bf12);
                        insertCell(table, reporte.getResultado_IMC(), Element.ALIGN_LEFT, 1, bf12);
                    }
                    //Añadir pdf al paraffo
                    parrafo.add(table);
                    //Añadir parrafo al documento
                    doc.add(parrafo);
                    doc.close();
                    docWriter.close();
                    response.setContentType("application/pdf");
                    response.setHeader("Content-disposition", "inline; filename=reporte " + equipo.getId() + ".pdf");

                    ServletOutputStream sos = response.getOutputStream();
                    baosPDf.writeTo(sos);
                    sos.flush();
                } else {
                    //Equipo no encontrado
                    request.getSession().setAttribute("mensaje", "El equipo buscado no existe");
                    request.getRequestDispatcher("error.jsp").forward(request, response);
                }
            } catch (Exception e) {
                //Error bd
                request.getSession().setAttribute("mensaje", "Hubo un problema con la base de datos, porfavor pruebe mas tarde");
                request.getRequestDispatcher("error.jsp").forward(request, response);
            }

            //Eliminar variables
            Registro.getInstance().getEquipos().remove(equipo);
            request.getSession().removeAttribute("idEquipo");
        } catch (Exception e) {
            //Acceso directo
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

    private void insertCell(PdfPTable table, String text, int align, int colspan, Font font) {

        PdfPCell cell = new PdfPCell(new Phrase(text.trim(), font));
        cell.setHorizontalAlignment(align);
        cell.setColspan(colspan);
        if (text.trim().equalsIgnoreCase("")) {
            cell.setMinimumHeight(10f);
        }
        table.addCell(cell);
    }

}
