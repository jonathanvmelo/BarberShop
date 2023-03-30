/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.barbershop.controller.helper;

import br.com.barbershop.model.User;
import br.com.barbershop.view.LoginScreen;

/**
 *
 * @author user
 */

/*
Funções da classe:

Obeter modelo da tela()
Setar modelo()
Limpar tela()
 */
public class LoginHelper {

    private final LoginScreen view;

    public LoginHelper(LoginScreen view) {
        this.view = view;
    }

    public User getModel() {
        String userName = view.getTxtUserName().getText();
        String password = view.getTxtPassword().getText();
        User model = new User(0, userName, password);
        return model;
    }
    
    public void setModel(User model){
        String name = model.getName();
        String password = model.getPassword();
        
        view.getTxtUserName().setText(name);
        view.getTxtPassword().setText(password);
    }
    
    public void clearScreen(){
    view.getTxtUserName().setText("");
    view.getTxtPassword().setText("");
    }

}
