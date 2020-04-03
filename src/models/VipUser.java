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
public class VipUser extends User{

    public VipUser(String name, double balance) {
        super(name, balance);
    }

    @Override
    public boolean withdraw(double amount) {
        balance -=amount;
        return true;
    }
    
}
