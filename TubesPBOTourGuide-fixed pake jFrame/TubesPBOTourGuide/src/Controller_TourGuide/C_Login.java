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
        System.out.println("MASUK");
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource().equals(viewLogin.getBtnbuatakun())){
            C_Register regis = new C_Register();
            viewLogin.dispose();
        }
    }

}
