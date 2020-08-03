package ru.gb;

import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "product-servlet", urlPatterns = "/product")
public class ProductServlet extends HttpServlet {

    public static String path = "/product";
    public static String headerName = "Товар";

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.getWriter().println("<h1>"+ headerName +"</h1>");
        resp.getWriter().println("<p><a href=" + req.getContextPath() + MainServlet.path +">" + MainServlet.headerName + "</a></p>");
        resp.getWriter().println("<p><a href=" + req.getContextPath() + CatalogServlet.path +">" + CatalogServlet.headerName + "</a></p>");
        resp.getWriter().println("<p><a href=" + req.getContextPath() + OrderServlet.path +">" + OrderServlet.headerName + "</a></p>");
        resp.getWriter().println("<p><a href=" + req.getContextPath() + CartServlet.path +">" + CartServlet.headerName + "</a></p>");


    }
}
