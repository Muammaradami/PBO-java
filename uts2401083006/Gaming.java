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
public class Gaming extends Laptop  {
    private String kartuGrafis;
    private int refreshRate;
    
    public Gaming(){
        
    }
    public String getKartuGrafis(){
        return kartuGrafis;
    }
    public void setKartuGrafis(String kartuGrafis){
        this.kartuGrafis = kartuGrafis;
    }
    public int getRefreshRate(){
        return refreshRate;
    }
    public void setRefreshRate(int refreshRate){
        this.refreshRate = refreshRate;
    }
   
    @Override
    public String display(){
        String merek = super.getMerek();
        int tahunProduksi = super.getTahunProduksi();
        int garansi = super.getGaransi();
        int ukuranLayar = super.getUkuranLayar();
        int kapasitasRAM = super.getKapasitasRAM();
        
        return merek + " | " + tahunProduksi + " | " + garansi + " | " + ukuranLayar + " | " + kapasitasRAM + " | " + kartuGrafis + " | " + refreshRate;
    }
}


