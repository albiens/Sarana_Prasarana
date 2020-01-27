
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
public class Pengambilan {

    /**
     * @return the Kepsek
     */
    public String getKepsek() {
        return Kepsek;
    }

    /**
     * @return the Wakasek
     */
    public String getWakasek() {
        return Wakasek;
    }
    private String Nama;
    private String UntukBagian;
    private int No;
    private String HariTgl;
    private String KodeBarang;
    private String NamaBarang;
    private int JumlahBarang;
    private String Kepsek;
    private String Wakasek;
    private String Alasan;
    
    
    public Pengambilan(String Nama,String UntukBagian,int No,String HariTgl,String KodeBarang,String NamaBarang,int JumlahBarang,String Kepsek,String Wakasek,String Alasan){
        this.Nama = Nama;
        this.UntukBagian = UntukBagian;
        this.No = No;
        this.HariTgl = HariTgl;
        this.KodeBarang = KodeBarang;
        this.NamaBarang = NamaBarang;
        this.JumlahBarang = JumlahBarang;
        this.Kepsek = Kepsek;
        this.Wakasek = Wakasek;
        this.Alasan = Alasan;
    }

    Pengambilan() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
    
    public String getNama(){
        return Nama;
    }
    public String getUntukBagian(){
        return UntukBagian;
    }
    public int getNo(){
        return No;
    }
    public String getHariTgl(){
        return HariTgl;
    }
    public String getKodeBarang(){
        return KodeBarang;
    }
    public String getNamaBarang(){
        return NamaBarang;
    }
    public int getJumlahBarang(){
        return JumlahBarang;
    }
    public String getAlasan(){
        return Alasan;
    }
}
