/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.barbershop.controller;

import br.com.barbershop.DAO.ConnectionFactory;
import br.com.barbershop.DAO.UserDAO;
import br.com.barbershop.controller.helper.LoginHelper;
import br.com.barbershop.model.User;
import br.com.barbershop.view.LoginScreen;
import br.com.barbershop.view.MenuScreen;
import java.sql.Connection;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author user
 */
public class LoginController {

    private final LoginScreen view;
    private final LoginHelper helper;

    public LoginController(LoginScreen view) {
        this.view = view;
        this.helper = new LoginHelper(view);
    }

    /**
     *
     */
    public void toEnterSystem() throws SQLException {
        // Pegar Usuário e senha digitados na LoginScreen
        String user = view.getTxtUserName().getText();
        String pass = view.getTxtPassword().getText();

        User aewauthenticateUser = new User(user, pass);

        // Pesquisar no BD e verificar se o nome e senha conferem com os cadastrados
        Connection conn = new ConnectionFactory().getConnection();
        UserDAO userDao = new UserDAO(conn);

       
        
        boolean exists =  userDao.checkUserAndPassword(aewauthenticateUser);
        
        if(exists){
         MenuScreen menu = new MenuScreen();
        menu.setVisible(true);
        }else{
        JOptionPane.showMessageDialog(null, "Usuário ou senha inválidos");
        }
    }

}
