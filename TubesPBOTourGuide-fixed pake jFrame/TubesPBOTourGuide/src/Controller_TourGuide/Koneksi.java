 
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
    
    



}
 