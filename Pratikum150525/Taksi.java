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
public class Taksi extends Mobil {
    protected int tarifAwal;
    protected int tarifPerKm;

    public Taksi() {

    }
    public Taksi(int tarifAwal, int tarifPerKm) {
        this.tarifAwal = tarifAwal;
        this.tarifPerKm = tarifPerKm;
    }
    public Taksi(int tarifAwal, int tarifPerKm, String bahanBakar, int kapasitasMesin, int jmlRoda, String warna) {
        super(bahanBakar, kapasitasMesin, jmlRoda, warna); 
        this.tarifAwal = tarifAwal;
        this.tarifPerKm = tarifPerKm;
    }
    public void setTarifAwal(int tarifAwal) {
        this.tarifAwal = tarifAwal;
    }
    public int getTarifAwal() {
        return tarifAwal;
    }
    public void setTarifPerKm(int tarifPerKm) {
        this.tarifPerKm = tarifPerKm;
    }
    public int getTarifPerKm() {
        return tarifPerKm;
    }
    
    
    @Override
    public void display() {
        super.display(); 
        System.out.println("Tarif Awal = Rp " + this.tarifAwal);
        System.out.println("Tarif Per KM = Rp " + this.tarifPerKm);
    }
}

