/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

/**
 *
 * @author g.irakleidis
 */
public abstract class User implements Withdrawable{
    protected String name;
    protected double balance;

    public User(String name, double balance) {
        this.name = name;
        this.balance = balance;
    }
    
}
