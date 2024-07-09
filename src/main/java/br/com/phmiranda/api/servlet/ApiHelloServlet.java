/**
 * User: Pedro.Miranda
 * Project: gerenciador
 * Description: primeiro servlet para entendimento de cada componente da classe.
 * Date: 07/01/2021
 */

package br.com.phmiranda.api.servlet;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(urlPatterns = "/hello-world")
public class ApiHelloServlet extends HttpServlet {
    @Override
    protected void service(HttpServletRequest request, HttpServletResponse response) throws IOException{
        PrintWriter saida = response.getWriter();
        System.out.println("Criando o SERVLET");
        saida.println("Olá mundo!");
        System.out.println("Destruindo o SERVLET");
    }
}
