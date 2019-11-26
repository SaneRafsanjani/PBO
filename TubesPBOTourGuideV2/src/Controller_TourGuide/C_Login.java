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
public class C_Login implements ActionListener {

    private CustomerLogin viewLogin;
    private CustomerRegistrasi viewRegis;
    private Koneksi kn;
    private String idCustomer;
    private String usernameCustomer;
    private String passwordCustomer;

    public C_Login() {
        kn = new Koneksi();
        viewLogin = new CustomerLogin();
        viewLogin.addActionListener(this);
        viewLogin.setVisible(true);
//        System.out.println("MASUK");
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Object source = e.getSource();
        if (e.getSource().equals(viewLogin.getbtnbuatakun())) {
            new C_Register();
            viewLogin.dispose();
        } else if (source.equals(viewLogin.getbtnmasuk())) {
            validasiCustLogin();
        } else if (source.equals(viewLogin.getbtnMasukAdmin())) {
            new C_AdmLogin();
        }
    }

    void validasiCustLogin() {
        usernameCustomer = viewLogin.getUsernameCustomer();
        passwordCustomer = viewLogin.getPasswordCustomer();
        String nama;
        if (usernameCustomer.isEmpty() || passwordCustomer.isEmpty()) {
            viewLogin.showMessage("Masukkan Username dan Password", "Error", 0);
        } else {
            if(kn.cekUserLog(usernameCustomer, passwordCustomer)){
                nama = kn.searchNama(usernameCustomer);
                new C_Menu();
                viewLogin.setVisible(false);
            } else{
                viewLogin.showMessage("Username atau Password Salah","Error", 0);
            }
        }
    }

}
