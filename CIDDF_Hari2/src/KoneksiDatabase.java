/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author User 21
 */
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
public class KoneksiDatabase {
    private static Connection koneksi;
    public static Connection getKoneksi(){
      if (koneksi==null) {
            try {
                String url="jdbc:mysql://localhost:3306/universitas";
                String user="root";
                String passwd="";
                DriverManager.registerDriver(new com.mysql.jdbc.Driver());
                koneksi=DriverManager.getConnection(url,user,passwd);
                System.out.println("Koneksi Berhasil");
            } catch  (SQLException err) {
                System.out.println("Error membuat Koneksi");
            }
        }
        return koneksi; 
    }
}   

