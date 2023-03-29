/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.barbershop.DAO;

import br.com.barbershop.model.User;
import br.com.barbershop.view.EmplyeeRegister;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author user
 */
public class UserDAO {

    private final Connection connection;

    public UserDAO(Connection connection) {
        this.connection = connection;
    }

    public void save(User user) throws SQLException {

        String sql = "INSERT INTO newusers (username, password, accesslevel) VALUES('" + user.getName() + "', '" + user.getPassword() + "','" + user.getAccessLevel() + "')";
        PreparedStatement stmt = connection.prepareStatement(sql);
        stmt.execute();
        stmt.close();
        connection.close();

    }

}
