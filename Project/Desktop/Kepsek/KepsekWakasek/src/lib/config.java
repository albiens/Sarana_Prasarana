package lib;

import java.sql.Connection; 
import java.sql.DriverManager;
import java.sql.SQLException; 
 
public class config {
    private static Connection mysqlconfig;
    public static Connection configDB()throws SQLException{
        try {
            String url="jdbc:mysql://localhost/dbsarpras"; //url database
            String user="root"; //user database
            String pass=""; //password database
            DriverManager.registerDriver(new com.mysql.jdbc.Driver());
            mysqlconfig=DriverManager.getConnection(url, user, pass);            
        } catch (Exception e) {
            //perintah menampilkan error pada koneksi
            System.err.println("koneksi gagal "+e.getMessage()); 
        }
        return mysqlconfig;
    }   }
