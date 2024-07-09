/**
 * User: Pedro.Miranda
 * Project: gerenciador
 * Description: this class execute...!
 * Date: 07/01/2021
 */

package br.com.phmiranda.api.servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(urlPatterns = "/empresas")
public class EmpresaServlet extends HttpServlet {

    protected void empresaServlet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String razaoSocial = request.getParameter("razaoSocial");
        PrintWriter saida = response.getWriter();
        System.out.println("Iniciando o cadastro da empresa: " + razaoSocial);
        saida.println("Nome da Empresa: " + razaoSocial);
    }
}
