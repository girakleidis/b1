/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

import Exceptions.MnhmonioException;

/**
 *
 * @author g.irakleidis
 */
public class SimpleUser extends User{

    public SimpleUser(String name, double balance) {
        super(name, balance);
    }

    @Override
    public boolean withdraw(double amount) throws MnhmonioException{
        if (amount <= balance){
        balance=balance-amount;
        return true;}
        else{
        throw new MnhmonioException("404 not found");    
         }
    }

    
}
