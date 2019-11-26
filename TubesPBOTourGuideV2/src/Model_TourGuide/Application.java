/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model_TourGuide;

import java.util.List;

/**
 *
 * @author rafsa
 */
public class Application {
    List<Customer> daftarCustomer;
    List<TourGuide> daftarTourGuide;
    List<PaketWisata> daftarPaketWisata;
    List<TempatWisata> daftarTempatWisata;
    
    public void inputTourGuide(String namaTourGuide,String notelpTourGuide,String idTourGuide,String emailTourGuide,String alamatTourGuide, String usernameCustomer, String passwordCustomer,String ttlCustomer){
       TourGuide tourguide = new TourGuide(namaTourGuide,notelpTourGuide,idTourGuide,ttlCustomer,usernameCustomer,passwordCustomer,emailTourGuide,alamatTourGuide);
        this.daftarTourGuide.add(tourguide);
    }

    public List<Customer> getDaftarCustomer() {
        return daftarCustomer;
    }

    public void setDaftarCustomer(List<Customer> daftarCustomer) {
        this.daftarCustomer = daftarCustomer;
    }

    public List<TourGuide> getDaftarTourGuide() {
        return daftarTourGuide;
    }

    public void setDaftarTourGuide(List<TourGuide> daftarTourGuide) {
        this.daftarTourGuide = daftarTourGuide;
    }

    public List<PaketWisata> getDaftarPaketWisata() {
        return daftarPaketWisata;
    }

    public void setDaftarPaketWisata(List<PaketWisata> daftarPaketWisata) {
        this.daftarPaketWisata = daftarPaketWisata;
    }

    public List<TempatWisata> getDaftarTempatWisata() {
        return daftarTempatWisata;
    }

    public void setDaftarTempatWisata(List<TempatWisata> daftarTempatWisata) {
        this.daftarTempatWisata = daftarTempatWisata;
    }
    
/*

public String searchToy(String id){
    int i = 0;
    while((i<toyList.size()) && (toyList.get(i).getId()!=id)){
        i++;
    }
        return toyList.get(i).toString();
}

    public String[] geToyListId(){
    String[] listId = new String[toyList.size()];
        for(int i = 0; i<toyList.size();i++){
            listId[i]=toyList.get(i).getId();
        }
            return listId;
}


  */  
   
    public String editTourGuide(TourGuide id){
        int i=0;
     while(i<daftarTourGuide.size()) {
        i++;
    }
        return daftarTourGuide.get(i).toString();
}

  }      
     /*
    ;
    public String getTourGuide(TourGuide id){}   
              for(int i = 0; i<daftarTourGuide.size();i++){
          return 
        }
            return listId;
}
}

 */