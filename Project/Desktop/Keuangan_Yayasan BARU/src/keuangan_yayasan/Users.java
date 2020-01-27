/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package keuangan_yayasan;

/**
 *
 * @author ASUS
 */
public class Users {
     private String Nama;
    private String Alamat;
    private String NIP;
    private String JenisKelamin;
    private String TTL;
    private String NoTelepon;
    private String Umur;
    private String Email;
    
    public Users(String Nama,String Alamat,String NIP,String JenisKelamin,String TTL, String NoTelepon,String Umur,String Email){
        this.Nama = Nama;
        this.Alamat = Alamat;
        this.NIP = NIP;
        this.JenisKelamin = JenisKelamin;
        this.TTL = TTL;
        this.NoTelepon = NoTelepon;
        this.Umur = Umur;
        this.Email = Email;
    }
    Users() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    public String getNama(){
        return Nama;
    }
    public String getAlamat(){
        return Alamat;
    }
    public String getNIP(){
        return NIP;
    }
    public String getJenisKelamin(){
        return JenisKelamin;
    }
    public String getTTL(){
        return TTL;
    }
    public String getNoTelepon(){
        return NoTelepon;
    }
    public String getUmur(){
        return Umur;
    }
    public String getEmail(){
        return Email;
    }
}
