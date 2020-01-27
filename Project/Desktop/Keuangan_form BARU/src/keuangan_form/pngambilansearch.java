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
public class pngambilansearch {

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
    private String HariTgl;
    private String Nama;
    private String JumlahBarang;
    private String Kepsek;
    private String Wakasek;
    
    public pngambilansearch(String NamaBarang,String HariTgl,String Nama,String JumlahBarang,String Kepsek,String Wakasek){
        this.NamaBarang = NamaBarang;
        this.HariTgl = HariTgl;
        this.Nama = Nama;
        this.JumlahBarang = JumlahBarang;
        this.Kepsek = Kepsek;
        this.Wakasek = Wakasek;
    }
    pngambilansearch() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    public String getNamaBarang(){
        return NamaBarang;
    }
    public String getHariTgl(){
        return HariTgl;
    }
    public String getNama(){
        return Nama;
    }    
    public String getJumlahBarang(){
        return JumlahBarang;
    }
    
}
