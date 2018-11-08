package fr.laerce.cinema;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.*;
import java.util.HashMap;

@WebServlet(name = "Session")
public class Session extends HttpServlet {

    private HashMap bdd;

    public void init() {
        Utilisateur bob = new
    }


        protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        }

        protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String login =  request.getParameter("login");
        String pass = request.getParameter("pass");
        HttpSession session = request.getSession();
        String co="connecté";
        String noco="invité";
//            if (bdd.containsKey(login) && bdd.containsValue(pass)) {
//                session.setAttribute("user",co  );
//            }
//            else{ session.setAttribute("user", noco ); }
            PrintWriter out = response.getWriter();
//                ServletContext cntx= getServletContext();
//                String filename = cntx.getRealPath("WEB-INF/datas/affiches/"+film.afficheNom);
                out.println("<!DOCTYPE html>");
                out.println("<html>");
                out.println("<head>");
                out.println("<title>Info de connexion</title>");
                out.println("</head>");
                out.println("<body>");
                out.println("<h1>"+session.getAttribute("user")+login+pass+bdd.containsKey("bob")+"<h1>");
                out.println("</html>");
        }
    }



