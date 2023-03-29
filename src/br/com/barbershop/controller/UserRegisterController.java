/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.barbershop.controller;

import br.com.barbershop.DAO.ConnectionFactory;
import br.com.barbershop.DAO.UserDAO;
import br.com.barbershop.model.User;
import br.com.barbershop.view.UserRegisterScreen;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author user
 */
public class UserRegisterController {

    private UserRegisterScreen view;

    public UserRegisterController(UserRegisterScreen view) {
        this.view = view;
    }

    public void saveNewUser() {
        
        String newUser = view.getTxtUserName().getText();
       
        String pass = view.getTxtPassword().getText();
        String access = view.getTxtAccessLevel().getSelectedItem().toString();

        User newUser1 = new User(newUser, pass, access);

        try {
            Connection conn = new ConnectionFactory().getConnection();
            UserDAO userdao = new UserDAO(conn);
            userdao.save(newUser1);

            JOptionPane.showMessageDialog(null, "Usuário cadastrado com sucesso!");
        } catch (SQLException ex) {
            Logger.getLogger(UserRegisterScreen.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
