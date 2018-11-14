package fr.laerce.cinema;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.*;
import java.util.ArrayList;
import java.util.HashMap;

@WebServlet(name = "Info")
public class Info extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
        protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
        {
            Integer id = Integer.parseInt( request.getParameter("id"));
            FilmsDonnees fd = new FilmsDonnees();
            Film film = fd.getById(id);
//            PrintWriter out = response.getWriter();
            HttpSession session= request.getSession(true);
            if (session.getAttribute("user")!= null) {
                Utilisateur utilisateur = (Utilisateur) session.getAttribute("user");
                utilisateur.film.add(film);
            }
//                out.println("<!DOCTYPE html>");
//                out.println("<html>");
//                out.println("<head>");
//                out.println("<title>Info de "+film.titre+"</title>");
//                out.println("</head>");
//                out.println("<body>");
//                out.println("<h1>"+film.titre+"<h1>");
//                out.println("<img height='150' width='150' src='/affiche?id="+id+"'></img>");
//                out.println("<h2>la note de ce film est "+film.note+"<h2>");
//                out.println("<a href='/Session' type='button'>acceuil</a> ");
//                out.println("</body>");
//                out.println("</html>");
            // pour les besoins de la vue
            request.setAttribute ("film", film);
            // délégation à la vue
            String jspview = "info.jsp";
            getServletConfig().getServletContext().getRequestDispatcher("/WEB-INF/jsp/"+jspview).forward(request, response);
        }

}



