package dao;

import java.sql.*;

public class ConnectionFactory {
    public Connection getConnection() throws ClassNotFoundException, SQLException {
        String urlBD = "jdbc:mysql://localhost:3306/bd";
        String user = "root";
        String password = "";
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            return DriverManager.getConnection(urlBD, user, password);
        } catch (SQLException e) {
            System.out.println("Exceção SQL: " + e.getMessage() + "\n" + "Verificar classe ConnectionFactory.java");
            throw e; // Lançar a exceção para que seja tratada em um nível superior, se necessário.
        } catch (ClassNotFoundException e) {
            System.out.println("Exceção Classe não encontrada: " + e.getMessage() + "\n" + "Verificar classe ConnectionFactory.java");
            throw e; // Lançar a exceção para que seja tratada em um nível superior, se necessário.
        }
    }
}