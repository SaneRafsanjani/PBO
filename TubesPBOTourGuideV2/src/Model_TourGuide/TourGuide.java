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
     String notelpTourGuide;
     String idTourGuide;

    public TourGuide(String notelpTourGuide, String idTourGuide, String nama, String ttl, String username, String password, String email, String alamat) {
        super(nama, ttl, username, password, email, alamat);
        this.notelpTourGuide = notelpTourGuide;
        this.idTourGuide = idTourGuide;
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
  
}
