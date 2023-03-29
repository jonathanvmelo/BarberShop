/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.barbershop.controller;



import br.com.barbershop.controller.helper.LoginHelper;
import br.com.barbershop.model.User;
import br.com.barbershop.view.LoginScreen;
import br.com.barbershop.view.MenuScreen;
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

    public void loginSystem() {
        // Pegar Usuário e senha da LoginScreen
       // UserDAO userDAO = new UserDAO();

//      Pesquisar no BD
       // User authenticadedUser = userDAO.selectByNameAndPassword(user);

        // Se o usuário da LoginScreen for igual ao cadastrado no BD, redirecionar para MenuScreen, caso contrario, mostrar mensagem de erro
//        try {
//            if(authenticadedUser != null){
//            MenuScreen menu = new MenuScreen();
//            menu.setVisible(true);
//            this.view.dispose();
//            }else{
//           view.showMessage("Usuário ou senha inválidos");
//            }
//            
//        } catch (Exception e) {
//           
       // }
    }

}
