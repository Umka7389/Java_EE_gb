package ru.gb;

import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
@WebServlet(name = "catalog-servlet", urlPatterns = "/catalog")
public class CatalogControllerServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setAttribute("activePage", "catalog");
        getServletContext().getRequestDispatcher("/WEB-INF/catalog.jsp").forward(req, resp);

    }
}
