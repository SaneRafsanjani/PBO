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
import java.util.UUID;

/**
 *
 * @author  
 */
public class C_Register implements ActionListener {

    private CustomerRegistrasi viewRegis;
    private Koneksi kn;
    private String usernameCustomer;
    private String namaCustomer;
    private String passwordCustomer;
    private String alamatCustomer;
    private String emailCustomer;
    private String ttlCustomer;
                  
    
    public C_Register() {
        kn = new Koneksi();
        viewRegis = new CustomerRegistrasi();
        viewRegis.addActionListener(this);
        viewRegis.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        
         if (e.getSource().equals(viewRegis.getBtndaftar())) {
            namaCustomer = viewRegis.getNamaCustomer();
            alamatCustomer = viewRegis.getalamatCustomer();
            emailCustomer = viewRegis.getEmailCustomer();
            ttlCustomer = viewRegis.getttlCustomer();
            usernameCustomer = viewRegis.getUsernameCustomer();
            passwordCustomer = viewRegis.getPasswordCustomer();
            
              String nama;
        if (usernameCustomer.isEmpty() || passwordCustomer.isEmpty()) {
            viewRegis.showMessage("Data tidak falid", "Error", 0);
         }else{
            kn.addCustomer(new Customer(UUID.randomUUID().toString().substring(0, 19), namaCustomer, alamatCustomer, "0", emailCustomer, ttlCustomer, usernameCustomer, passwordCustomer,"", ""));
            viewRegis.showMessage("Register Berhasil", "Success", 0);
            new C_Menu();
        }
        
    }

}}
