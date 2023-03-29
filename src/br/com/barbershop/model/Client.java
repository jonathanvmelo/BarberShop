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
public class Client extends Person{
    
    private String cep;
    private String address;

    public Client( int id, String name, char gender, String birthDate, String cellPhone, String email, String cpf, String cep, String address) throws ParseException {
        super(id, name, gender, birthDate, cellPhone, email, cpf);
        this.cep = cep;
        this.address = address;
    }
    
    public Client( int id, String name, String cellPhone, String email, String cep, String address) {
        super(id, name, cellPhone, email);
        this.cep = cep;
        this.address = address;
    }
    
  
    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
    
    
  
}
