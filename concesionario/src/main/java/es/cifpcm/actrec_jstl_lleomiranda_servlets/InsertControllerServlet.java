/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package es.cifpcm.actrec_jstl_lleomiranda_servlets;

import es.cifpcm.actrec_jstl_lleomiranda_datasource.DbManager;
import es.cifpcm.actrec_jstl_lleomiranda_pojos.Marca;
import es.cifpcm.actrec_jstl_lleomiranda_pojos.Modelo;
import es.cifpcm.actrec_jstl_lleomiranda_pojos.Tipo;
import java.io.IOException;
import java.sql.SQLException;
import java.sql.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author l
 */
@WebServlet(name = "InsertControllerServlet", urlPatterns = {"/insertController"})
public class InsertControllerServlet extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException, SQLException {
        List<Tipo> tipos = DbManager.tipos();
        List<Marca> marcas = DbManager.marcas();
        request.setAttribute("tipos", tipos);
        request.setAttribute("marcas", marcas);
        request.getRequestDispatcher("/insertModel.jsp").forward(request, response);
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
        try {
            processRequest(request, response);
        } catch (SQLException ex) {
            Logger.getLogger(InsertControllerServlet.class.getName()).log(Level.SEVERE, null, ex);
        }
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
        
        int idMarca = Integer.parseInt(request.getParameter("idMarca"));
        int idTipo = Integer.parseInt(request.getParameter("idTipo"));
        String modelo = request.getParameter("modelo");
        String fechaS = request.getParameter("fecha");
        try {
            Date fecha = Date.valueOf(fechaS);
            int result = DbManager.insert(new Modelo(idMarca,idTipo,modelo,fecha));
            if(result > 0) 
                request.getRequestDispatcher("listController").forward(request, response);
        } catch (SQLException ex) {
            Logger.getLogger(InsertControllerServlet.class.getName()).log(Level.SEVERE, null, ex);
        }
        
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
