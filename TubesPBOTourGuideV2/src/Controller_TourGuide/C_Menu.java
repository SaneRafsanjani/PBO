/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller_TourGuide;

import Model_TourGuide.*;
import View_TourGuide.Menu;
import View_TourGuide.PaketWisata;
import View_TourGuide.Pemesanan;
import View_TourGuide.TempatWisata;
import View_TourGuide.TourGuide;
import View_TourGuide.Pengaturan;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author Fahlar Reva
 */
public class C_Menu implements ActionListener {
    private Menu viewMenu;
    private Koneksi kn;
    
    public C_Menu(){
        kn = new Koneksi();
        viewMenu = new Menu();
        viewMenu.addActionListener(this);
        viewMenu.setVisible(true);
    }
    @Override
    public void actionPerformed(ActionEvent e){
        Object source = e.getSource();
        if (source.equals(viewMenu.getbtnPakWis())) {
            new C_PaketWisata();
            viewMenu.dispose();
        } else if (source.equals(viewMenu.getbtnTemWis())) {
            new C_TempatWisata();
            viewMenu.dispose();
        } else if (source.equals(viewMenu.getbtnTG())) {
            new C_TG();
            viewMenu.dispose();
        } else if (source.equals(viewMenu.getbtnPesan())){
            new C_Pemesanan();
            viewMenu.dispose();
        } else if (source.equals(viewMenu.getbtnPengaturan())){
            new C_Pengaturan();
            viewMenu.dispose();
        } else if (source.equals(viewMenu.getbtnKeluar())){
            new C_Login();
            viewMenu.dispose();
        }
    }
}
