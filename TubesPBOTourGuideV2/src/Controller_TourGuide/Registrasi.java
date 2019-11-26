/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller_TourGuide;

import Model_TourGuide.Customer;
import View_TourGuide.CustomerRegistrasi;
import javax.swing.JOptionPane;

/**
 *
 * @author rafsa
 */
public class Registrasi {
    private CustomerRegistrasi cr;
    private Customer cs;
   
    public Registrasi(CustomerRegistrasi cr){
        this.cr = cr;
    }
    
    public void daftar(){
        JOptionPane.showMessageDialog(cr,"a");
    }
    
}
