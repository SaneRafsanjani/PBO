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
            while (rs.next()) {
                daftarCustomer.add(new Customer(rs.getString("idCustomer"), rs.getString("notelpCustomer"), rs.getString("nama"), rs.getString("ttl"), rs.getString("username"), rs.getString("password"), rs.getString("email"), rs.getString("alamat")));
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
        query += "'" + cus.getNama() + "',";
        query += "'" + cus.getIdCustomer() + "',";
        query += "'" + cus.getAlamat() + "',";
        query += "'" + cus.getNotelpCustomer() + "',";
        query += "'" + cus.getEmail() + "',";
        query += "'" + cus.getUsername() + "',";
        query += "'" + cus.getPassword() + "',";
        query += "'" + cus.getTtl() + "'";
        query += ")";
        if (manipulate(query)) {
            daftarCustomer.add(cus);
        }
        disconnect();
    }

    public void delCustomer(String id) {
        connect();
        String query = "DELETE FROM customer WHERE nim='" + id + "'";
        if (manipulate(query)) {
            for (Customer c : daftarCustomer) {
                if (c.getIdCustomer().equals(id)) {
                    daftarCustomer.remove(c);
                    break;
                }
            }
        }
        disconnect();
    }

//    public void updateCustomer(Customer cus) {
//        connect();
//        String query = "UPDATE customer SET";
//         query += "'" + cus.getNama() + "',";
//        query += "'" + cus.getIdCustomer() + "',";
//        query += "'" + cus.getAlamat()+ "',";
//        query += "'" + cus.getNotelpCustomer()+ "',";
//        query += "'" + cus.getEmail()+ "',";
//        query += "'" + cus.getUsername()+ "',";
//        query += "'" + cus.getPassword()+ "',";
//        query += "'" + cus.getTtl()+ "'";
//        if (manipulate(query)){
//            for (Customer c : daftarCustomer) {
//                if (c.getIdCustomer().equals(cus.getIdCustomer())){
//                    c.setIdCustomer(cus.getIdCustomer());
//                    c.setNama(cus.getNama());
//                    c.setAlamat(cus.getAlamat());
//                    c.setNotelpCustomer(cus.getNotelpCustomer());
//                    c.setEmail(cus.getEmail());
//                    c.setTtl(cus.getTtl());
//                    c.setUsername(cus.getUsername());
//                    c.setPassword(cus.getPassword());
//                    break;
//                }
//            }
//        }
//        disconnect();
//    }
//    
    public boolean cekUserLog(String x, String y) {
        boolean cek = false;
        for (Customer c : daftarCustomer) {
            System.out.println("MASUKAN");
            System.out.println("username " + x + ".");
            System.out.println("pass " + y + ".");
            System.out.println("DATABASE");
            System.out.println("username " + c.getUsername() + ".");
            System.out.println("pass " + c.getPassword() + ".");
            if ((c.getUsername().equals(x)) && (c.getPassword().equals(y))) {
                cek = true;
                break;
            }
        }
        System.out.println("CEK" + cek);
        return cek;
    }

    public String searchNama(String x) {
        String nama = null;
        for (Customer c : daftarCustomer) {
            if (c.getNama().equals(x)) {
                nama = c.getNama();
            }
        }
        return nama;
    }

}
