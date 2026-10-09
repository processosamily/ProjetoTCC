/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.projetoempregoaqui.controller.endereceo;

import br.com.projetoempregoaqui.dao.CategoriaDAO;
import br.com.projetoempregoaqui.dao.EnderecoDAO;
import br.com.projetoempregoaqui.model.Categoria;
import br.com.projetoempregoaqui.model.Endereco;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author SAMILYDESOUZAPROCESS
 */
@WebServlet(name = "CadastrarEndereco", urlPatterns = {"/CadastrarEndereco"})
public class CadastrarEndereco extends HttpServlet {

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
        response.setContentType("text/html;charset=UTF-8");
        try {
            int idEndereco = request.getParameter("idEndereco").isEmpty() ? 0 : Integer.parseInt(request.getParameter("idEndereco"));
            String logradouroEnd = request.getParameter("logradouroEnd");
            String cepEnd = request.getParameter("cepEnd");
            String bairroEnd = request.getParameter("bairroEnd");
            String cidadeEnd = request.getParameter("cidadeEnd");
            String estadoEnd = request.getParameter("estadoEnd");
            int numEnd = Integer.parseInt(request.getParameter("numEnd"));
            
            //Construindo um novo Objeto do Tipo Profissao e 
            //armazenando os dados recebidos da View
            Endereco endereco = new Endereco(idEndereco, logradouroEnd, cepEnd, bairroEnd, cidadeEnd, estadoEnd, numEnd);
            
            //Criando um novo objeto do tipo ProfissaoDAO para chamar  o método GRAVAR
            EnderecoDAO enderecoDAO = new EnderecoDAO();
            enderecoDAO.gravar(endereco);
            
            //Retornando para view
            request.setAttribute("mensagem", "Endereço gravado com sucesso!");
        } catch (SQLException | ClassNotFoundException ex) {
            ex.printStackTrace();
            System.out.println("Problemas na Controller ao Cadastrar Endereço! ERRO: " + ex.getMessage());
            request.setAttribute("mensagem", ex.getMessage());
        }
        //Disparando o retorno para view
        request.getRequestDispatcher("NovaCategoria").forward(request, response);
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
