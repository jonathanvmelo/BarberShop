/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.barbershop.DAO;

import br.com.barbershop.model.User;
import br.com.barbershop.view.EmplyeeRegister;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
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

        String sql = "INSERT INTO newusers (username, password, accesslevel) VALUES( ?, ?, ?)";
        PreparedStatement stmt = connection.prepareStatement(sql);
        stmt.setString(1, user.getName());
        stmt.setString(2, user.getPassword());
        stmt.setString(3, user.getAccessLevel());
        stmt.execute();
    }

    public void updateUser(User user) throws SQLException {
        String sql = "UPDATE INTO newusers SET username = ?, password = ? WHERE id = ?";
        PreparedStatement stmt = connection.prepareStatement(sql);
        stmt.setString(1, user.getName());
        stmt.setString(2, user.getPassword());
        stmt.setInt(3, user.getId());
        stmt.execute();
    }

    public void removeById(int id) throws SQLException {
        String sql = "DELETE FROM newusers WHERE id = ?";
        PreparedStatement stmt = connection.prepareStatement(sql);
        stmt.setInt(1, id);
        stmt.execute();
    }

    public ArrayList<User> getAll() throws SQLException {
        String sql = "SELECT * FROM  newusers";
        PreparedStatement stmt = connection.prepareStatement(sql);

        return search(stmt);
    }

    private ArrayList<User> search(PreparedStatement stmt) throws SQLException {
        ArrayList<User> users = new ArrayList<>();
        stmt.execute();
        ResultSet rst = stmt.getResultSet();

        while (rst.next()) {
            int id = rst.getInt("id");
            String user = rst.getString("username");
            String pass = rst.getString("password");

            User userRst = new User(id, user, pass);
            users.add(userRst);

        }
        return users;
    }

    public User selectById(User user) throws SQLException {
        String sql = "SELECT * FROM  newusers WHERE id = ?";
        PreparedStatement stmt = connection.prepareStatement(sql);

        stmt.setInt(1, user.getId());
        search(stmt);
        
        return search(stmt).get(0);
    }

    public boolean checkUserAndPassword(User user) throws SQLException {
        String sql = "SELECT * FROM newusers WHERE username = ? AND password = ?";
        PreparedStatement stmt = connection.prepareStatement(sql);
        stmt.setString(1, user.getName());
        stmt.setString(2, user.getPassword());
        stmt.execute();

        ResultSet rst = stmt.getResultSet();
        return rst.next();

    }

}
