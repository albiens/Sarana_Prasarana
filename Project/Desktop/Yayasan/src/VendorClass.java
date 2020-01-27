/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Oban Sobandi
 */
public class VendorClass {

    /**
     * @return the NamaPerusahaan
     */
    public String getNamaPerusahaan() {
        return NamaPerusahaan;
    }

    /**
     * @return the Alamat
     */
    public String getAlamat() {
        return Alamat;
    }

    /**
     * @return the Email
     */
    public String getEmail() {
        return Email;
    }

    /**
     * @return the NoTelepon
     */
    public String getNoTelepon() {
        return NoTelepon;
    }

    /**
     * @return the AtasNama
     */
    public String getAtasNama() {
        return AtasNama;
    }
    private String NamaPerusahaan;
    private String Alamat;
    private String Email;
    private String NoTelepon;
    private String AtasNama;
    
   
    
    
    public VendorClass(String NamaPerusahaan,String Alamat,String Email,String NoTelepon,String AtasNama){
        this.NamaPerusahaan = NamaPerusahaan;
        this.Alamat = Alamat;
        this.Email = Email;
        this.NoTelepon = NoTelepon;
        this.AtasNama = AtasNama;
    }

    VendorClass() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
