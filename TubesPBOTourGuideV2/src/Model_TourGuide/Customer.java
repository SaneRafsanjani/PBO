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
    String namaCustomer;   
    String alamatCustomer;
    String notelpCustomer;
    String emailCustomer;

    public Customer(String idCustomer, String namaCustomer, String alamatCustomer, String notelpCustomer, String emailCustomer, String ttlCustomer, String usernameCustomer, String passwordCustomer, String emailTourGuide, String alamatTourGuide) {
        super(ttlCustomer, usernameCustomer, passwordCustomer, emailTourGuide, alamatTourGuide);
        this.idCustomer = idCustomer;
        this.namaCustomer = namaCustomer;
        this.alamatCustomer = alamatCustomer;
        this.notelpCustomer = notelpCustomer;
        this.emailCustomer = emailCustomer;
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

    public String getNamaCustomer() {
        return namaCustomer;
    }

    public void setNamaCustomer(String namaCustomer) {
        this.namaCustomer = namaCustomer;
    }

    public String getIdCustomer() {
        return idCustomer;
    }

    public void setIdCustomer(String idCustomer) {
        this.idCustomer = idCustomer;
    }

   

    public String getTtlCustomer() {
        return ttlCustomer;
    }

    public void setTtlCustomer(String ttlCustomer) {
        this.ttlCustomer = ttlCustomer;
    }

    public String getAlamatCustomer() {
        return alamatCustomer;
    }

    public void setAlamatCustomer(String alamatCustomer) {
        this.alamatCustomer = alamatCustomer;
    }

    public String getNotelpCustomer() {
        return notelpCustomer;
    }

    public void setNotelpCustomer(String notelpCustomer) {
        this.notelpCustomer = notelpCustomer;
    }

    public String getEmailCustomer() {
        return emailCustomer;
    }

    public void setEmailCustomer(String emailCustomer) {
        this.emailCustomer = emailCustomer;
    }

    public String getUsernameCustomer() {
        return usernameCustomer;
    }

    public void setUsernameCustomer(String usernameCustomer) {
        this.usernameCustomer = usernameCustomer;
    }

    public String getPasswordCustomer() {
        return passwordCustomer;
    }

    public void setPasswordCustomer(String passwordCustomer) {
        this.passwordCustomer = passwordCustomer;
    }
 
    
    
    
    
    
    
    
    
    
}
