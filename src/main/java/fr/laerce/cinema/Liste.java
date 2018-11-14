package fr.laerce.cinema;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/**
 * Created by fred on 03/02/2016.
 */
@WebServlet(name = "Liste")
public class Liste extends HttpServlet {


    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String name = request.getParameter("name");
//        PrintWriter out = response.getWriter();
        FilmsDonnees fd = new FilmsDonnees();
        ArrayList<Film> liste = new ArrayList<>();
//        out.print("<body>");
//        out.print("<ul>");
        for (Film film:fd.lesFilms) {
            if (film.titre.toLowerCase().contains(name.toLowerCase())){
//                out.print("<li><a href='/info?id="+film.id+"'>"+film.titre+"</a></li>");
                liste.add(film);
            }
        }
        request.setAttribute ("liste", liste);
        String jspview = "liste.jsp";
        getServletConfig().getServletContext().getRequestDispatcher("/WEB-INF/jsp/"+jspview).forward(request, response);
//        out.print("</ul>");
//        out.print("</body>");
    }


    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        FilmsDonnees fd = new FilmsDonnees();
        ArrayList<Film> liste = new ArrayList<>();
        String global = request.getParameter("global");
//        out.println("<!DOCTYPE html>");
//        out.println("<html>");
//        out.println("<head>");
//        out.println("<title>Liste de film</title>");
//        out.println("</head>");
//        out.println("<body>");
//        out.println("<h1>les film<h1>");
//        out.println("<ul>");
        switch (Integer.parseInt(global)) {
            case 0 :
                Collections.sort(fd.lesFilms, new FilmComparator());
               fd.lesFilms.forEach(film -> liste.add(film));
                break;
            case 1 :
               Collections.sort(fd.lesFilms, Collections.reverseOrder(new FilmComparator()));
               fd.lesFilms.forEach(film ->liste.add(film));
               break;
            case 2 :
                Collections.sort(fd.lesFilms, Collections.reverseOrder(Comparator.comparingDouble(o -> o.note)));
                fd.lesFilms.forEach(film -> liste.add(film));
                break;
            case 3 :Collections.sort(fd.lesFilms, Comparator.comparingDouble(o -> o.note));
                fd.lesFilms.forEach(film -> liste.add(film));
                break;
        }
        request.setAttribute ("liste", liste);
        String jspview = "liste.jsp";
        getServletConfig().getServletContext().getRequestDispatcher("/WEB-INF/jsp/"+jspview).forward(request, response);


//        out.println("</ul>");
//        out.println("</body>");
//        out.println("<footer>");
//        out.println("</footer>");
//        out.println("</html>");
    }
}
