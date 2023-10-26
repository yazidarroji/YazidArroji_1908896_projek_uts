/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.tebakkartu;
/**
 *
 * @author yazidarroji
 */
import java.util.Scanner;
public class TebakKartu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int countTebakJenis = 0;
        int countTebakNomor = 0;
        // Menentukan jenis dan nomor kartu secara acak
        int jenisKartuBenar = RandomNumber(4);
        int nomorKartuBenar = RandomNumber(13);
        System.out.println("Tebak Kartu Remi Sederhana!");
        // Logic Tebak Jenis
        while (true) {
            System.out.print("Pilih Jenis Kartu dengan memasukan nomor 1-4:\n");
            System.out.print("1. Berlian (diamond)\n");
            System.out.print("2. Sekop atau Waru (spade)\n");
            System.out.print("3. Hati (Heart)\n");
            System.out.print("4. Keriting (Club)\n");
            System.out.print("Tebakan Jenis (1-4): ");
            int tebakJenis = scanner.nextInt();
            countTebakJenis++;
            if (tebakJenis < 1 || tebakJenis > 4) {
                System.out.println("Mohon Masukkan angka antara 1 dan 4 !!!");
                continue;
            }
            if (tebakJenis == jenisKartuBenar) {
                System.out.println("BENAR!!!");
                break;
            } else {
                System.out.println("SALAH!!!");
            }
        }
        // Logic Tebak Nomor
        while (true) {
            System.out.print("Masukkan Nomor Kartu (1=Ace/As, 2-10, 11=Jack, 12=Queen, 13=King): ");
            int tebakNomor = scanner.nextInt();
            countTebakNomor++;

            if (tebakNomor < 1 || tebakNomor > 13) {
                System.out.println("Mohon Masukkan angka antara 1 dan 13 !!!");
                continue;
            }

            if (tebakNomor == nomorKartuBenar) {
                System.out.println("BENAR!!!");
                break;
            } else {
                System.out.println("SALAH!!!");
            }
        }
        // Menampilkan prestasi penebak
        System.out.println("Selamat, Anda menang setelah " + countTebakJenis + " kali menebak Jenis Kartu, dan " + countTebakNomor + " kali menebak Nomor Kartu.");
    }
    // Metode untuk menghasilkan angka acak dari 1 hingga angka maksimal yang dimasukan
    private static int RandomNumber(int max) {
        return (int) (Math.random() * max) + 1;
    }
}
