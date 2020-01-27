package lib;


import com.mysql.jdbc.Connection;
import com.mysql.jdbc.Statement;
import java.sql.DriverManager;

public class koneksi {
    public static Connection con;
    public static Statement stm;
    public static void main(String args[]){
        try {
            String url ="jdbc:mysql://localhost/dbsarpras";
            String user="root";
            String pass="";
            Class.forName("com.mysql.jdbc.Driver");
            con =(Connection) DriverManager.getConnection(url,user,pass);
            stm = (Statement) con.createStatement();
            System.out.println("koneksi berhasil;");
        } catch (Exception e) {
            System.err.println("koneksi gagal" +e.getMessage());
        }
    }
}