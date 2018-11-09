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

    ArrayList<Utilisateur> liste=new ArrayList<>();
    public void init() {
        Utilisateur bob = new Utilisateur("bob", "marley" );
        liste.add(bob);
    }


        protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        }

        protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String login =  request.getParameter("login");
        String pass = request.getParameter("pass");

        boolean co=false;


            PrintWriter out = response.getWriter();
            for (Utilisateur u : liste) {
                if (u.login==login && u.pass==pass){
                    HttpSession session = request.getSession(true);
                }
            }
                out.println("<!DOCTYPE html>");
                out.println("<html>");
                out.println("<head>");
                out.println("<title>Info de connexion</title>");
                out.println("</head>");
                out.println("<body>");
                out.println("<h1>co<h1>");
                out.println("</body>");
                out.println("</html>");
        }
    }



