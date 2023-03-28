/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.barbershop.model;

import java.util.Date;

/**
 *
 * @author user
 */

public abstract class Person {

    protected int id;
    protected String name;
    protected char gender;
    protected Date date;
    protected String cellPhone;
    protected String email;
    protected String cpf;

    public Person(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public Person(int id, String name, String cellPhone, String email) {
        this.id = id;
        this.name = name;
        this.cellPhone = cellPhone;
        this.email = email;
    }
    
    

    public Person(int id, String name, char gender, Date date, String cellPhone, String email, String cpf) {
        this.id = id;
        this.name = name;
        this.gender = gender;
        this.date = date;
        this.cellPhone = cellPhone;
        this.email = email;
        this.cpf = cpf;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getCellPhone() {
        return cellPhone;
    }

    public void setCellPhone(String cellPhone) {
        this.cellPhone = cellPhone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    @Override
    public String toString() {
        return "Person{" + "id = " + id + ", name = " + name + ", gender = " + gender + ", date = " + date + ", cellPhone = " + cellPhone + ", email = " + email + ", cpf = " + cpf + '}';
    }
    
    

}
