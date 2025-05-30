/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tugas22052025;

/**
 *
 * @author Acer
 */
public class Cash extends Pembayaran implements MetodePembayaran  {
     public Cash(double totalBayar) {
        super(totalBayar);
    }

   
        public void pilihMetode() {
        System.out.println("Metode: Pembayaran Tunai");
    }


    
     @Override
    public void displayProsesPembayaran() {
        System.out.println("Proses Pembayaran Tunai:");
        System.out.println("1. Serahkan uang ke kasir");
        System.out.println("2. Tunggu kembalian jika ada");
        System.out.println("Pembayaran selesai!");
    }
}