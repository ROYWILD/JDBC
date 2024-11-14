package JDBC.app;

import JDBC.entities.Functie;
import JDBC.repositories.FunctieRepository;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class Application {
    public static void main(String[] args) throws SQLException {
        FunctieRepository functieRepository = new FunctieRepository();
        List<Functie> functies  = functieRepository.findAll();
        functies.forEach(System.out::println);


    }
}
