/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uts2401083006;

/**
 *
 * @author Acer
 */
public class SmartWatch extends SmartPhone {
    private int ukuranLayar;
    private boolean tahanAir;
    
    public int getUkuranLayar(){
        return ukuranLayar;
    }
    public void setUkuranLayar(int ukuranLayar){
        this.ukuranLayar = ukuranLayar;
    }
    public boolean getTahanAir(){
        return tahanAir;
    }
    public void setTahanAir(boolean tahanAir){
        this.tahanAir = tahanAir;
    }
    
    @Override
    public String display(){
        String merek = super.getMerek();
        int tahunProduksi = super.getTahunProduksi();
        int garansi = super.getGaransi();
        int kapasitasBaterai = super.getKapasitasBaterai();
        int jumlahKamera = super.getJumlahKamera();
        
        return merek + " | " + tahunProduksi + " | " + garansi + " | " + kapasitasBaterai + " | " + jumlahKamera + " | " + ukuranLayar + " | " + tahanAir;
    }
}
