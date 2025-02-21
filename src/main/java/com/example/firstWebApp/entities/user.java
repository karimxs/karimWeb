package com.example.firstWebApp.entities;

import jakarta.persistence.*;

import java.io.Serializable;

@Entity
@Table(name = "users")
public class user implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String userName;
    private String  email;
    private String password;

    public user() {

    }

    public Long getId() {
        return id;
    }
    //check

    public void setId(Long id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }


    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public user(Long id, String userName, String email, String password) {
        this.id = id;
        this.userName = userName;
        this.email = email;
        this.password=password;
    }

    @Override
    public String toString() {
        return "user{" +
                "id=" + id +
                ", userName='" + userName + '\'' +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}