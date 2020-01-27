/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Oban Sobandi
 */
public class UserClass {

    /**
     * @return the Nama
     */
    public String getNama() {
        return Nama;
    }

    /**
     * @return the NIP
     */
    public String getNIP() {
        return NIP;
    }

    /**
     * @return the Alamat
     */
    public String getAlamat() {
        return Alamat;
    }

    /**
     * @return the JenisKelamin
     */
    public String getJenisKelamin() {
        return JenisKelamin;
    }

    /**
     * @return the TTL
     */
    public String getTTL() {
        return TTL;
    }

    /**
     * @return the NoTelepon
     */
    public String getNoTelepon() {
        return NoTelepon;
    }

    /**
     * @return the Umur
     */
    public int getUmur() {
        return Umur;
    }

    /**
     * @return the Email
     */
    public String getEmail() {
        return Email;
    }
    private String Nama;
    private String NIP;
    private String Alamat;
    private String JenisKelamin;
    private String TTL;
    private String NoTelepon;
    private int Umur;
    private String Email;
   
    
    
    public UserClass(String Nama,String NIP,String Alamat,String JenisKelamin,String TTL,String NoTelepon,int Umur, String Email){
        this.Nama = Nama;
        this.NIP = NIP;
        this.Alamat = Alamat;
        this.JenisKelamin = JenisKelamin;
        this.TTL = TTL ;
        this.NoTelepon = NoTelepon;
        this.Umur = Umur;
        this.Email = Email;
    }

    UserClass() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
