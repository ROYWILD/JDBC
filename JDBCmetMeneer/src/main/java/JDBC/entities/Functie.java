package JDBC.entities;

public class Functie {

    private Integer id;
    private String naam;

    public Functie() {
    }

    public Functie(Integer id, String naam) {
        this.id = id;
        this.naam = naam;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNaam() {
        return naam;
    }

    public void setNaam(String naam) {
        this.naam = naam;
    }

    @Override
    public String toString() {
        return "Functie{" +
                "id=" + id +
                ", naam='" + naam + '\'' +
                '}';
    }
}
