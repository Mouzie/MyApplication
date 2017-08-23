package com.example.admin.myapplication;

/**
 * Created by admin on 2017/08/23.
 */

public class User {
     String name;
     String surname;
     String email;
     String password;
     String cPassword;

    public User(String name, String surname, String email, String password, String cPassword ){

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        surname = surname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        password = password;
    }

    public String getCPassword() {
        return cPassword;
    }

    public void setCPassword(String CPassword) {
        this.cPassword = CPassword;
    }
}
