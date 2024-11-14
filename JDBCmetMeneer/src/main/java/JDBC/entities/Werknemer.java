package JDBC.entities;

import JDBC.insert.Insert;

public class Werknemer {

    private Integer id;
    private String voornaam;
    private String achternaam;
    private String telefoon;
    private Functie functie;

    public Werknemer() {
    }

    public Werknemer(Integer id, String voornaam, String achternaam, String telefoon, Functie functie) {
        this.id = id;
        this.voornaam = voornaam;
        this.achternaam = achternaam;
        this.telefoon = telefoon;
        this.functie = functie;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getVoornaam() {
        return voornaam;
    }

    public void setVoornaam(String voornaam) {
        this.voornaam = voornaam;
    }

    public String getAchternaam() {
        return achternaam;
    }

    public void setAchternaam(String achternaam) {
        this.achternaam = achternaam;
    }

    public String getTelefoon() {
        return telefoon;
    }

    public void setTelefoon(String telefoon) {
        this.telefoon = telefoon;
    }

    public Functie getFunctie() {
        return functie;
    }

    public void setFunctie(Functie functie) {
        this.functie = functie;
    }

    @Override
    public String toString() {
        return "Werknemer{" +
                "id=" + id +
                ", voornaam='" + voornaam + '\'' +
                ", achternaam='" + achternaam + '\'' +
                ", telefoon='" + telefoon + '\'' +
                ", functie=" + functie +
                '}';
    }
}
