
import java.sql.Date;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Acer
 */
public class CheckoutClass {
    public String getNamaBarang() {
        return NamaBarang;
    }

    /**
     * @return the TanggalPembelian
     */
    public Date getTanggalPembelian() {
        return TanggalPembelian;
    }

    /**
     * @return the TanggalPengiriman
     */
    public Date getTanggalPengiriman() {
        return TanggalPengiriman;
    }

    /**
     * @return the Status
     */
    public String getStatus() {
        return Status;
    }
    private String NamaBarang;
    private Date TanggalPembelian;
    private Date TanggalPengiriman;
    private String Status;
   
    
    
    public CheckoutClass(String NamaBarang,Date TanggalPembelian,Date TanggalPengiriman,String Status){
        this.NamaBarang = NamaBarang;
        this.TanggalPembelian = TanggalPembelian;
        this.TanggalPengiriman = TanggalPengiriman;
        this.Status = Status;
    }

    CheckoutClass() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
