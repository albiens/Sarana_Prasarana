/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author USER
 */
public class PBJK {
    private String DimintaOleh;
    private String Jabatan;
    private String TglDibutuhkan;
    private String Tanggal;
    private String Bidang;
    private String NamaBarang;
    private String Harga;
    private String JumlahBarang;
    private String Kepsek;
    private String Wakasek;
    private String Alasan;
    
    
    public PBJK(String DimintaOleh,String Jabatan,String TglDibutuhkan,String Tanggal,String Bidang,String NamaBarang,String Harga,String JumlahBarang,String Kepsek,String Wakasek,String Alasan){
        this.DimintaOleh = DimintaOleh;
        this.Jabatan = Jabatan;
        this.TglDibutuhkan = TglDibutuhkan;
        this.Tanggal = Tanggal;
        this.Bidang = Bidang;
        this.NamaBarang = NamaBarang;
        this.Harga = Harga;
        this.JumlahBarang = JumlahBarang;
        this.Kepsek = Kepsek;
        this.Wakasek = Wakasek;
        this.Alasan = Alasan;
    }

    PBJK() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    public String getDimintaOleh(){
        return DimintaOleh;
    }
    public String getJabatan(){
        return Jabatan;
    }
    public String getTglDibutuhkan(){
        return TglDibutuhkan;
    }
    public String getTanggal(){
        return Tanggal;
    }
    public String getBidang(){
        return Bidang;
    }
    public String getNamaBarang(){
        return NamaBarang;
    }
    public String getHarga(){
        return Harga;
    }
    public String getJumlahBarang(){
        return JumlahBarang;
    }
    public String getAlasan(){
        return Alasan;
    }

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
}
