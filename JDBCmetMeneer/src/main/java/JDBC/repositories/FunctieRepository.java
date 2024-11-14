package JDBC.repositories;

import JDBC.config.ConnectionManager;
import JDBC.entities.Functie;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class FunctieRepository {

    public List<Functie> findAll() throws SQLException {
        List<Functie> functies = new ArrayList<>();
        Connection connection = ConnectionManager.getConnection();
        Statement statement = connection.createStatement();
        ResultSet rs = statement.executeQuery("SELECT * FROM functie");
        while (rs.next()) {
            int id = rs.getInt("Id");
            String naam = rs.getString("naam");
            functies.add(new Functie(id,naam));
        }
        rs.close();
        statement.close();
        connection.close();
        return functies;
    }

    public void save(int id , String naam){
        try {
            Connection conn = ConnectionManager.getConnection();
            String query = "INSERT INTO functie (id, naam) VALUES (?, ? )";
            PreparedStatement pstmt = conn.prepareStatement(query);
            pstmt.setInt(1, id);
            pstmt.setString(2, naam);

            int rowsAffected = pstmt.executeUpdate();
            if (rowsAffected > 0) {
                System.out.println("Data succesvol ingevoerd voor functie");
                System.out.println();
            } else {
                System.out.println("Er is een probleem opgetreden bij het invoeren van de gegevens.");
            }

            pstmt.close();
            conn.close();
        } catch (SQLException var13) {

        } catch (Exception var14) {
            Exception e = var14;
            e.printStackTrace();
        }

    }

    public void update(int id, String naam) {
        try {
            Connection conn = ConnectionManager.getConnection();

            // Create a PreparedStatement object to execute an UPDATE query
            String query = "UPDATE functie SET naam = ? WHERE id = ?";
            PreparedStatement pstmt = conn.prepareStatement(query);

            // Set the parameter values for the UPDATE query
            pstmt.setString(1, naam);
            pstmt.setInt(2, id);


            // Execute the UPDATE query
            int numRowsUpdated = pstmt.executeUpdate();

            if (numRowsUpdated > 0) {
                System.out.println("Record met id = " + id + " is bijgewerkt in tabel functie.");
            } else {
                System.out.println("Geen record met id = " + id + " is gevonden in tabel functie.");
            }

            pstmt.close();
            conn.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


    public void delete(int id) {
        try {
            Connection connection = ConnectionManager.getConnection();
            String query = "DELETE FROM functie WHERE id = ?";
            PreparedStatement pstmt = connection.prepareStatement(query);
            pstmt.setInt(1, id);
            // Execute the DELETE query
            int numRowsDeleted = pstmt.executeUpdate();

            if (numRowsDeleted > 0) {
                System.out.println("Record met id = " + id + " is verwijderd uit de functie tabel.");
            } else {
                System.out.println("Geen record met id = " + id + " is gevonden in de functie tabel.");

            }

            // Close the PreparedStatement and connection objects
            pstmt.close();
            connection.close();
        } catch (Exception e) {
            e.printStackTrace();

        }
    }



}
