/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.barbershop.DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author user
 */
public class ConnectionFactory {
    
    public Connection getConnection() throws SQLException{
        Connection connection = DriverManager.getConnection("jdbc:postgresql://localhost:5432/barbershop", "postgres", "postgres");
        return connection;
    }

    public void closeConnection(){
    
    }
}
