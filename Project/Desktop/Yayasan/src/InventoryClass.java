
import java.sql.Date;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Oban Sobandi
 */
public class InventoryClass {

    /**
     * @return the NamaBarang
     */
    public String getNamaBarang() {
        return NamaBarang;
    }

    /**
     * @return the KodeBarang
     */
    public String getKodeBarang() {
        return KodeBarang;
    }

    /**
     * @return the Jumlah
     */
    public int getJumlah() {
        return Jumlah;
    }

    /**
     * @return the Stok
     */
    public int getStok() {
        return Stok;
    }

    /**
     * @return the MinStok
     */
    public int getMinStok() {
        return MinStok;
    }

    /**
     * @return the Status
     */
    public String getStatus() {
        return Status;
    }
    private String NamaBarang;
    private String KodeBarang;
    private int Jumlah;
    private int Stok;
    private int MinStok;
    private String Status;
   
    
    
    public InventoryClass(String NamaBarang,String KodeBarang,int Jumlah,int Stok,int MinStok,String Status){
        this.NamaBarang = NamaBarang;
        this.KodeBarang = KodeBarang;
        this.Jumlah = Jumlah;
        this.Stok = Stok;
        this.MinStok = MinStok;
        this.Status = Status;
    }

    InventoryClass() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
