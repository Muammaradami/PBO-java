/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tugas22052025;

import java.util.Scanner;

/**
 *
 * @author Acer
 */
public class MainPembayaran {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        while (true) {
            System.out.println("\n=== Sistem Pembayaran ===");
            
            double totalBayar;
            while (true) {
                System.out.print("Masukkan total bayar (minimal Rp 1000): Rp ");
                totalBayar = input.nextDouble();
                input.nextLine();
                
                if (totalBayar >= 1000) {
                    break;
                }
                System.out.println("Maaf, minimal pembayaran adalah Rp1000");
            }
            
            System.out.println("\nPilih Metode Pembayaran:");
            System.out.println("1. transfer");
            System.out.println("2. cash");
            System.out.println("3. e-wallet");
            System.out.println("4. kartu kredit");
            System.out.print("pilihan: ");
            int pilihan = input.nextInt();
            input.nextLine();
            
            Pembayaran MetodePembayaran;
            
            switch(pilihan) {
                case 1:
                    System.out.print("Masukkan Nama Bank: ");
                    String namaBank = input.nextLine();
                    MetodePembayaran = new Transfer(totalBayar, namaBank);
                    break;
                case 2:
                    MetodePembayaran = new Cash(totalBayar);
                    break;
                case 3:
                    MetodePembayaran = new Ewallet(totalBayar);
                    break;
                case 4:
                    MetodePembayaran = new KartuKredit(totalBayar);
                    break;
                default:
                    System.out.println("Pilihan tidak valid!");
                    continue;
            }
            
            System.out.println("\n=== Detail Pembayaran ===");
            MetodePembayaran.pilihMetode();
            System.out.println("Total: Rp" + totalBayar);
            
            System.out.println("\n=== Proses Pembayaran ===");
            ((MetodePembayaran)MetodePembayaran).displayProsesPembayaran();
            
            System.out.print("\nLakukan pembayaran lagi? (y/n): ");
            String jawaban = input.nextLine();
            if (!jawaban.equalsIgnoreCase("y")) {
                System.out.println("\nTerima kasih telah menggunakan sistem pembayaran!");
                break;
            }
        }
    }
}