package fr.laerce.cinema;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.*;

@WebServlet(name = "info")
public class info extends HttpServlet {
        protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        }

        protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
        {
            Integer id = Integer.parseInt( request.getParameter("id"));
            FilmsDonnees fd = new FilmsDonnees();
            Film film = fd.getById(id);
            PrintWriter out = response.getWriter();
                out.println("<!DOCTYPE html>");
                out.println("<html>");
                out.println("<head>");
                out.println("<title>info de "+film.afficheNom+"</title>");
                out.println("</head>");
                out.println("<body>");
                out.println("<h1>+"film.afficheNom+"<h1>");
                out.println("<ul>");
                out.println("</html>");

        }
        }


