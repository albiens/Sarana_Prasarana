/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package keuangan_form;

/**
 *
 * @author ROGUE
 */
public class pbjnksearch {

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
    private String NamaBarang;
    private String Tanggal;
    private String Harga;
    private String JumlahBarang;
    private String Kepsek;
    private String Wakasek;
    
    public pbjnksearch(String NamaBarang,String Tanggal,String Harga,String JumlahBarang,String Kepsek,String Wakasek){
        this.NamaBarang = NamaBarang;
        this.Tanggal = Tanggal;
        this.Harga = Harga;
        this.JumlahBarang = JumlahBarang;
        this.Kepsek = Kepsek;
        this.Wakasek = Wakasek;
    }
    pbjnksearch() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    public String getNamaBarang(){
        return NamaBarang;
    }
    public String getTanggal(){
        return Tanggal;
    }
    public String getHarga(){
        return Harga;
    }    
    public String getJumlahBarang(){
        return JumlahBarang;
    }
    
}
