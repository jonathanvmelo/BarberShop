/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.barbershop.model;

import java.text.ParseException;
import java.util.Date;

/**
 *
 * @author user
 */
public class User extends Person{
    
    private String password;
    private String accessLevel;

    public User(String name, String password, String accessLevel ) {
        super(name);
        this.password = password;
        this.accessLevel = accessLevel;
    }

    public User( String name, String password) {
        super(name);
        this.password = password;
    }

    public User( int id, String name, String password) {
        super(id, name);
        this.password = password;
    }

    public User( int id, String name, char gender, String birthDate, String cellPhone, String email, String cpf, String password, String accessLevel) throws ParseException {
        super(id, name, gender, birthDate, cellPhone, email, cpf);
        this.password = password;
        this.accessLevel = accessLevel;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getAccessLevel() {
        return accessLevel;
    }

    public void setAccessLevel(String accessLevel) {
        this.accessLevel = accessLevel;
    }

    
    
    
}
