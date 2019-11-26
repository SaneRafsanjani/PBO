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
public class PaketWisata {
    List<TourGuide> listGuide;
    List<TempatWisata> listtujuan;
    Date tglBerangkat;
    Date tglpulang;
 

//    public PaketWisata(List<TourGuide> listGuide, List<TempatWisata> listtujuan, Date tglBerangkat, Date tglpulang) {
//        this.listtujuan = listtujuan;
//        this.tglBerangkat = tglBerangkat;
//        this.tglpulang = tglpulang;
//        //buat objek list guide dan tujuan
//    }

    public PaketWisata(Date tglBerangkat, Date tglpulang) {
        this.tglBerangkat = tglBerangkat;
        this.tglpulang = tglpulang;
        this.listGuide = new ArrayList();
        this.listtujuan = new ArrayList();
    }

    
    
    public void addTempatWisata(TempatWisata t) {
        listtujuan.add(t);
    }
       
    
    public void assignTourGuide(TourGuide guide){
            listGuide.add(guide);}
       
    
    
    public void setTglBerangkat(Date tglBerangkat) {
        this.tglBerangkat = tglBerangkat;
    }
    
    
    public Date getTglBerangkat() {
        return tglBerangkat;
    }

    public void setTglpulang(Date tglpulang) {
        this.tglpulang = tglpulang;
    }

    public Date getTglpulang() {
        return tglpulang;
    }

    public List<TourGuide> getListGuide() {
        return listGuide;
    }

    public void setListGuide(List<TourGuide> listGuide) {
        this.listGuide = listGuide;
    }

    public List<TempatWisata> getListtujuan() {
        return listtujuan;
    }

    public void setListtujuan(List<TempatWisata> listtujuan) {
        this.listtujuan = listtujuan;
    }
 
    
}
