package fr.laerce.cinema;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.HashMap;

@WebServlet(name = "Session")
public class Session extends HttpServlet {

    private HashMap bdd;

    public void init() {
        HashMap<String, String> bdd = new HashMap();
        bdd.put("bob", "marley");
        bdd.put("azerty", "123456");
    }


        protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        }

        protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String login = (String) request.getAttribute("login");
        String pass = (String)  request.getAttribute("pass");
        HttpSession session = request.getSession();
            if (bdd.containsKey(login) && bdd.get(login).equals(pass)) {
                session.setAttribute("user", true );
            }
        }
    }



