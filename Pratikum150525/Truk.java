/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pratikum150525;

/**
 *
 * @author Acer
 */
public class Truk extends Mobil{
    protected int muatanMaks;

    public Truk() {
        
    }
    public Truk(int muatanMaks) {
        this.muatanMaks = muatanMaks;
    }
    public Truk(int muatanMaks, String bahanBakar, int kapasitasMesin, int jmlRoda, String warna) {
        super(bahanBakar, kapasitasMesin, jmlRoda, warna);
        this.muatanMaks = muatanMaks;
    }
    public void setMuatanMaks(int muatanMaks) {
        this.muatanMaks = muatanMaks;
    }  
    public int getMuatanMaks() {
        return muatanMaks;
    }
    
   
    @Override
    public void display() {
        super.display(); 
        System.out.println("Muatan Maksimal = " + this.muatanMaks + " kg");
    }
}

