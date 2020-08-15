package ru.gb;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(urlPatterns = {"/error404", "/error403"})
public class ErrorServlet404 extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        if(req.getServletPath().equals("/error404")){
            resp.getWriter().println("<h1>Ошибка!Страница не найдена!</h1>");
        } else if (req.getServletPath().equals("/error403")){
            resp.getWriter().println("<h1>Ошибка!Доступ запрещен!</h1>");
        }
    }
}
