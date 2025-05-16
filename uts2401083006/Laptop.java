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
public class Laptop extends Elektronik {
    private int ukuranLayar;
    private int kapasitasRAM;
    
    public Laptop(){
        
    }
    public int getUkuranLayar(){
        return ukuranLayar;
    }
    public void setUkuranLayar(int ukuranLayar){
        this.ukuranLayar = ukuranLayar;
    }
    public int getKapasitasRAM(){
        return kapasitasRAM;
    }
    public void setKapasitasRAM(int kapasitasRAM){
        this.kapasitasRAM = kapasitasRAM;
    }
    
    @Override
    public String display(){
        String merek = super.getMerek();
        int tahunProduksi = super.getTahunProduksi();
        int garansi = super.getGaransi();
        
        return merek + " | " + tahunProduksi + " | " + garansi + " | " + ukuranLayar + " | " + kapasitasRAM;
    }
}


