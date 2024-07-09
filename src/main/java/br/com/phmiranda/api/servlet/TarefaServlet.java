package br.com.phmiranda.api.servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(urlPatterns = "/tarefas")
public class TarefaServlet extends HttpServlet {
    protected void tarefaServlet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
