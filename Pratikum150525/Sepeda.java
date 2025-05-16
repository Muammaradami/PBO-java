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
public class Sepeda extends Kendaraan{
    protected String jmlSadel;
    protected int jmlGir;
  
    public Sepeda() {
        
    }
    public Sepeda(String jmlSadel, int jmlGir) {
        this.jmlSadel = jmlSadel;
        this.jmlGir = jmlGir;
    }
    public Sepeda(String jmlSadel, int jmlGir, int jmlRoda, String warna) {
        super(jmlRoda, warna);
        this.jmlSadel = jmlSadel;
        this.jmlGir = jmlGir;
    }
    public void setJmlSadel(String jmlSadel) {
        this.jmlSadel = jmlSadel;
    }
    public String getJmlSadel() {
        return jmlSadel;
    }
    public void setJmlGir(int jmlGir) {
        this.jmlGir = jmlGir;
    }
    public int getJmlGir() {
        return jmlGir;
    }
    
    @Override
    public void display() {
        System.out.println("Kelas Sepeda");
        System.out.println("Jumlah Roda = " + this.jmlRoda);
        System.out.println("Warna = " + this.warna);
        System.out.println("Jumlah Sadel = " + this.jmlSadel);
        System.out.println("Jumlah Gir = " + this.jmlGir);
    }
}

