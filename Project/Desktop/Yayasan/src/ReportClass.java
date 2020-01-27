/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Acer
 */
public class ReportClass {
    private int No;
    private String Bulan;
    private String JenisPembelian;
    private int TotalPengeluaran;
   
    
    
    public ReportClass(int No,String Bulan,String JenisPembelian,int TotalPengeluaran){
        this.No = No;
        this.Bulan = Bulan;
        this.JenisPembelian = JenisPembelian;
        this.TotalPengeluaran = TotalPengeluaran;
   
    }

    ReportClass() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    /**
     * @return the No
     */
    public int getNo() {
        return No;
    }

    /**
     * @return the Bulan
     */
    public String getBulan() {
        return Bulan;
    }

    /**
     * @return the JenisPembelian
     */
    public String getJenisPembelian() {
        return JenisPembelian;
    }

    /**
     * @return the TotalPengeluaran
     */
    public int getTotalPengeluaran() {
        return TotalPengeluaran;
    }
}
