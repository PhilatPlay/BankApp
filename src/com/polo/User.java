package com.polo;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class User {
    private int id;
    private String name;
    private String email;
    private int age;
    private String role;
    private double accountBalance;
    private Boolean loggedIn;

    public User(){

    }

    public User(int id, String name, String email, int age, String role, double accountBalance, Boolean loggedIn) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.age = age;
        this.role = role;
        this.accountBalance = accountBalance;
        this.loggedIn = loggedIn;
    }

    public int getId() {
        return id;
    }

    public void setId() {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public double getAccountBalance() {
        return accountBalance;
    }

    public void setAccountBalance(double accountBalance) {
        this.accountBalance = accountBalance;
    }

    public boolean getLoggedIn() {
        return loggedIn;
    }

    public void setLoggedIn(Boolean loggedIn) {
        this.loggedIn = loggedIn;
    }



//    @Override
//    public void deposit(int amount) {
//
//    }
//
//    @Override
//    public void transfer(int amount) {
//
//    }
//
//    @Override
//    public void withdraw(int amount) {
//
//    }


}
