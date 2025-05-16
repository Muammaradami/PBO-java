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
public class SmartPhone extends Elektronik {
    private int kapasitasBaterai;
    private int jumlahKamera;
    
    public SmartPhone(){
        
    }
    public int getKapasitasBaterai(){
        return kapasitasBaterai;
    }
    public void setKapasitasBaterai(int kapasitasBaterai){
        this.kapasitasBaterai = kapasitasBaterai;
    }
    public int getJumlahKamera(){
        return jumlahKamera;
    }
    public void setJumlahKamera(int jumlahKamera){
        this.jumlahKamera = jumlahKamera;
    }
    
    @Override
    public String display(){
        String merek = super.getMerek();
        int tahunProduksi = super.getTahunProduksi();
        int garansi = super.getGaransi();
        
        return merek + " | " + tahunProduksi + " | " + garansi + " | " + kapasitasBaterai + " | " + jumlahKamera;
    }
}


