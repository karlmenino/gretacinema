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

@WebServlet(name = "Session")
public class Session extends HttpServlet {

    ArrayList<Utilisateur> liste = new ArrayList<>();

    public void init() {
        Utilisateur bob = new Utilisateur("bob", "marley");
        Utilisateur azerty = new Utilisateur("azerty", "123");
        liste.add(bob);
        liste.add(azerty);
    }


    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String login = request.getParameter("login");
        String pass = request.getParameter("pass");
        HttpSession session = request.getSession();
        PrintWriter out = response.getWriter();
        out.println("<!DOCTYPE html>");
        out.println("<html>");
        out.println("<head>");
        out.println("<title>Info de connexion</title>");
        out.println("</head>");
        out.println("<body>");
        out.println("<h1>co<h1>");
        for (Utilisateur u : liste) {
            //                if (session.getAttribute("user") == null) {
            //                    session.setAttribute("connection",true);
            //                }
            if (u.login.equals(login) && u.pass.equals(pass)) session.setAttribute("user", u);
        }
        out.println("<a href='/Session' type='button'>acceuil method='get'</a> ");
        out.println("</body>");
        out.println("</html>");
    }


    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        PrintWriter out = response.getWriter();
        HttpSession session = request.getSession(true);
        Utilisateur u = (Utilisateur) session.getAttribute("user");
        out.println("<!DOCTYPE html>");
        out.println("<html>");
        out.println("<head>");
        out.println("<title>Info de connexion</title>");
        out.println("</head>");
        out.println("<body>");
        out.println("<h1>liste des films vue par" + u.login + "<h1>");
        for (Film f : u.film) {
            out.println("<h2>" + f.titre + "<h2>");
        }
        out.println("<a href='/index.jsp' type='button'>acceuil</a> ");
        out.println("</body>");
        out.println("</html>");
    }
}



