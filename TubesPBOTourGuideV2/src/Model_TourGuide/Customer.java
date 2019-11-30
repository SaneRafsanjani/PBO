/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model_TourGuide;

import java.util.Date;
import java.util.List;

/**
 *
 * @author rafsa
 */
public class Customer extends Person {

    List<Pemesanan> ListPemesanan;
    String idCustomer;
    String notelpCustomer;

    public Customer(String idCustomer, String notelpCustomer, String nama, String ttl, String username, String password, String email, String alamat) {
        super(nama, ttl, username, password, email, alamat);
        this.idCustomer = idCustomer;
        this.notelpCustomer = notelpCustomer;
    }


    
    public void createPemesanan(double totalHarga, Date tglPesan) {
        Pemesanan p = new Pemesanan(totalHarga,tglPesan);
        this.ListPemesanan.add(p);
    }

    public List<Pemesanan> getListPemesanan() {
        return ListPemesanan;
    }

    public void setListPemesanan(List<Pemesanan> ListPemesanan) {
        this.ListPemesanan = ListPemesanan;
    }

    public String getIdCustomer() {
        return idCustomer;
    }

    public void setIdCustomer(String idCustomer) {
        this.idCustomer = idCustomer;
    }

    public String getNotelpCustomer() {
        return notelpCustomer;
    }

    public void setNotelpCustomer(String notelpCustomer) {
        this.notelpCustomer = notelpCustomer;
    }   
    
}
