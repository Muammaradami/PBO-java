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
public class Transfer extends Pembayaran implements MetodePembayaran {
    private final String namaBank;

    public Transfer(double totalBayar, String namaBank) {
        super(totalBayar);
        this.namaBank = namaBank;
    }

   
    
    @Override
    public void pilihMetode() {
        System.out.println("Metode: Transfer Bank");
        System.out.println("Bank: " + namaBank);
    }

  
    
    @Override
    public void displayProsesPembayaran() {
        System.out.println("Proses Transfer:");
        System.out.println("1. Membuka aplikasi bank");
        System.out.println("2. Memasukkan nomor rekening");
        System.out.println("3. Transfer Rp" + totalBayar);
        System.out.println("Pembayaran selesai!");
    }
}