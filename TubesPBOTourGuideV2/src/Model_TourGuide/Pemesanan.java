/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model_TourGuide;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *
 * @author rafsa
 */
public class Pemesanan {
    List<PaketWisata> listPaket;
    double totalHarga;
    Date tglPesan;

    Pemesanan(double totalHarga, Date tglPesan) {
        this.totalHarga = totalHarga;
        this.tglPesan = tglPesan;
    }

    public void addPaketWisata(PaketWisata pw  ) {
        listPaket.add(pw);
    
    }

    public double getTotalHarga() {
        return totalHarga;
    }

    public void setTotalHarga(double totalHarga) {
        this.totalHarga = totalHarga;
    }

    public Date getTglPesan() {
        return tglPesan;
    }

    public void setTglPesan(Date tglPesan) {
        this.tglPesan = tglPesan;
    }

    public List<PaketWisata> getListPaket() {
        return listPaket;
    }

    public void setListPaket(List<PaketWisata> listPaket) {
        this.listPaket = listPaket;
    }
    
    
}
