/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller_TourGuide;

import Model_TourGuide.*;
import View_TourGuide.CustomerLogin;
import View_TourGuide.CustomerRegistrasi;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author  
 */
public class C_Register implements ActionListener {

    private CustomerRegistrasi viewRegis;
    private Koneksi kn;

    public C_Register() {
        kn = new Koneksi();
        viewRegis = new CustomerRegistrasi();
        viewRegis.addActionListener(this);
        viewRegis.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        
    }

}
