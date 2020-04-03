/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bank1;

import Exceptions.MnhmonioException;
import models.SimpleUser;
import models.VipUser;

/**
 *
 * @author g.irakleidis
 */
public class Bank1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        VipUser vu =new VipUser("george",10000.0);
        SimpleUser su = new SimpleUser("nick", 10000.0);
        
        try{
        System.out.println(su.withdraw(15000)+","+su.getBalance());
        }catch(MnhmonioException e){
            e.printStackTrace();
        }
    }
    
}
