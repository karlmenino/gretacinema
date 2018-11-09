package fr.laerce.cinema;

import java.util.ArrayList;

public class Utilisateur {
    public String login;
    public String pass;
    public ArrayList<Film> film = new ArrayList<Film>();
    public boolean co;
    public Utilisateur(String log,String pass) {
        this.login=log;
        this.pass=pass;
    }


}
