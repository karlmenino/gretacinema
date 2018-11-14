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

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public ArrayList<Film> getFilm() {
        return film;
    }

    public void setFilm(ArrayList<Film> film) {
        this.film = film;
    }

    public boolean isCo() {
        return co;
    }

    public void setCo(boolean co) {
        this.co = co;
    }
}
