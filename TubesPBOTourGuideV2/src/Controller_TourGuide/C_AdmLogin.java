/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller_TourGuide;

import View_TourGuide.Menu;
import java.util.logging.Logger;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import Model_TourGuide.*;  

/**
 *
 * @author Fahlar Reva
 */
public class C_AdmLogin {
     
    private Menu viewAdmin;
    private Koneksi kn;

    
    
    
    public C_AdmLogin() {        
        kn = new Koneksi();
        viewAdmin = new Menu();
        viewAdmin.addActionListener(this);
        viewAdmin.setVisible(true);
    }


    




}
     


 