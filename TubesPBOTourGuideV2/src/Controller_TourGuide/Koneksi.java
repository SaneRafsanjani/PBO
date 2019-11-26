 
package Controller_TourGuide;

import Model_TourGuide.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
 
public class Koneksi {

    private Connection conn = null;
    Statement stmt = null;
    ResultSet rs = null;
    private ArrayList<TempatWisata> tWisata = new ArrayList<>();
    private ArrayList<Customer> daftarCustomer = new ArrayList<>();

    public Koneksi() {
        loadCustomer();
    }

    //Koneksi session
    public void connect() {
        String url = "jdbc:mysql://localhost/tourguide";
        String user = "root";
        String pass = "";
        try {
            conn = DriverManager.getConnection(url, user, pass);
            stmt = conn.createStatement();
            System.out.println("Connected");
        } catch (SQLException ex) {
            System.out.println("Not Connected");
            Logger.getLogger(Koneksi.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void disconnect() {
        try {
            conn.close();
            stmt.close();
            System.out.println("Disonnected");
        } catch (SQLException ex) {
            Logger.getLogger(Koneksi.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public boolean manipulate(String query) {
        boolean cek = false;
        try {
            int rows = stmt.executeUpdate(query);
            if (rows > 0) {
                cek = true;
            }
        } catch (SQLException ex) {
            Logger.getLogger(Koneksi.class.getName()).log(Level.SEVERE, null, ex);
        }
        return cek;
    }

    private void loadCustomer() {
         connect();
        try {
            String query = "SELECT * FROM customer";
            rs = stmt.executeQuery(query);
            while (rs.next()){
                daftarCustomer.add(new Customer(rs.getString("namaCustomer"),rs.getString("idCustomer"),  rs.getString("alamatCustomer"), rs.getString("notelpCustomer"), rs.getString("emailCustomer") , rs.getString("ttlCustomer"), rs.getString("usernameCustomer"), rs.getString("passwordCustomer"), rs.getString("emailTourGuide"), rs.getString("alamatTourGuide") ));
            }
        } catch (SQLException ex) {
            Logger.getLogger(Koneksi.class.getName()).log(Level.SEVERE, null, ex);
        }
        disconnect();
    }
    
 
      public ArrayList<Customer> getCustomer() {
        return daftarCustomer;
    }
    
    public void addCustomer(Customer cus) {
        connect();
        String query = "INSERT INTO customer VALUES (";
        query += "'" + cus.getNamaCustomer() + "',";
        query += "'" + cus.getIdCustomer()+ "',";
        query += "'" + cus.getAlamatCustomer()+ "',";
        query += "'" + cus.getNotelpCustomer()+ "'";
        query += "'" + cus.getEmailCustomer()+ "'";
        query += "'" + cus.getUsernameCustomer()+ "'";
        query += "'" + cus.getPasswordCustomer()+ "'";
               query += ")";
        if (manipulate(query)) daftarCustomer.add(cus);
        disconnect();
    }
     
    public void delCustomer(String id) {
        connect();
        String query = "DELETE FROM Customer WHERE nim='" + id + "'";
        if (manipulate(query)){
            for (Customer c : daftarCustomer) {
                if (c.getIdCustomer().equals(id)){
                    daftarCustomer.remove(c);
                    break;
                }
            }
        }
        disconnect();
    }
    
    public void updateCustomer(Customer cus) {
        connect();
        String query = "UPDATE mahasiswa SET";
         query += "'" + cus.getNamaCustomer() + "',";
        query += "'" + cus.getIdCustomer()+ "',";
        query += "'" + cus.getAlamatCustomer()+ "',";
        query += "'" + cus.getNotelpCustomer()+ "'";
        query += "'" + cus.getEmailCustomer()+ "'";
        query += "'" + cus.getUsernameCustomer()+ "'";
        query += "'" + cus.getPasswordCustomer()+ "'";
        if (manipulate(query)){
            for (Customer c : daftarCustomer) {
                if (c.getIdCustomer().equals(cus.getIdCustomer())){
                    c.setIdCustomer(cus.getIdCustomer());
                    c.setNamaCustomer(cus.getNamaCustomer());
                    c.setAlamatCustomer(cus.getAlamatCustomer());
                    c.setNotelpCustomer(cus.getNotelpCustomer());
                    c.setEmailCustomer(cus.getEmailCustomer());
                    c.setUsernameCustomer(cus.getUsernameCustomer());
                    c.setPasswordCustomer(cus.getPasswordCustomer());
                     
                     
                     break;
                }
            }
        }
        disconnect();
    }
    
    public boolean cekUserLog(String x, String y){
        boolean cek = false;
        for (Customer c : daftarCustomer) {
            if (c.getUsernameCustomer().equals(x) && c.getPasswordCustomer().equals(y)){
                cek = true;
                break;
            }
        }
        return cek;
    }
    
    public String searchNama(String x){
        String nama = null;
        for (Customer c : daftarCustomer){
            if (c.getNamaCustomer().equals(x)) {
                nama = c.getNamaCustomer();
            }
        }
        return nama;
    }
    
    
    
}
    
    
    
    



