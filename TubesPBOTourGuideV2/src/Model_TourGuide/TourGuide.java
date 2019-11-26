/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model_TourGuide;

/**
 *
 * @author rafsa
 */
public class TourGuide extends Person {    
     String namaTourGuide;
     String notelpTourGuide;
     String idTourGuide;

    public TourGuide(String namaTourGuide, String notelpTourGuide, String idTourGuide, String ttlCustomer, String usernameCustomer, String passwordCustomer, String emailTourGuide, String alamatTourGuide) {
        super(ttlCustomer, usernameCustomer, passwordCustomer, emailTourGuide, alamatTourGuide);
        this.namaTourGuide = namaTourGuide;
        this.notelpTourGuide = notelpTourGuide;
        this.idTourGuide = idTourGuide;
    }



    
   
   
   
    public String getNamaTourGuide() {
        return namaTourGuide;
    }

    public void setNamaTourGuide(String namaTourGuide) {
        this.namaTourGuide = namaTourGuide;
    }

    public String getNotelpTourGuide() {
        return notelpTourGuide;
    }

    public void setNotelpTourGuide(String notelpTourGuide) {
        this.notelpTourGuide = notelpTourGuide;
    }

    public String getIdTourGuide() {
        return idTourGuide;
    }

    public void setIdTourGuide(String idTourGuide) {
        this.idTourGuide = idTourGuide;
    }

    public String getEmailTourGuide() {
        return emailTourGuide;
    }

    public void setEmailTourGuide(String emailTourGuide) {
        this.emailTourGuide = emailTourGuide;
    }

    public String getAlamatTourGuide() {
        return alamatTourGuide;
    }

    public void setAlamatTourGuide(String alamatTourGuide) {
        this.alamatTourGuide = alamatTourGuide;
    }
            
  
}
