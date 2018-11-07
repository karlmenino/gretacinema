package fr.laerce.cinema;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.*;
import java.util.Collections;

/**
 * Created by fred on 03/02/2016.
 */
@WebServlet(name = "liste")
public class liste extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {


    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        FilmsDonnees fd = new FilmsDonnees();
        out.println("<!DOCTYPE html>");
        out.println("<html>");
        out.println("<head>");
        out.println("<title>Liste de film</title>");
        out.println("</head>");
        out.println("<body>");
        out.println("<h1>les film<h1>");
        out.println("<ul>");
        Collections.sort(fd.lesFilms, new filmComparator());
        fd.lesFilms.forEach(film -> out.println("<li><a href='/affiche?id="+film.id+"'>"+film.titre+"</li>"));

        out.println("</ul>");
        out.println("</body>");
        out.println("<footer>");
        out.println("</footer>");
        out.println("</html>");
    }
}
