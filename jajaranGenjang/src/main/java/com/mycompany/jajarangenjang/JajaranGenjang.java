/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.jajarangenjang;

/**
 *
 * @author yazidarroji
 */
public class JajaranGenjang {
    private double sisiMiring;
    private double alas;
    private double tinggi;
    // Konstruktor tanpa argumen (default)
    public JajaranGenjang() {
        this.sisiMiring = 1;
        this.alas = 1;
        this.tinggi = 1;
    }
    // Konstruktor dengan parameter
    public JajaranGenjang(double sisiMiring, double alas, double tinggi) {
        this.sisiMiring = sisiMiring;
        this.alas = alas;
        this.tinggi = tinggi;
    }
    // Method untuk menghitung luas jajaran genjang
    public double getLuas() {
        return alas * tinggi;
    }
    // Method untuk menghitung keliling jajaran genjang
    public double getKeliling() {
        return 2 * (alas + sisiMiring);
    }
    public static void main(String[] args) {
        // Menampilkan informasi dengan Nilai default adalah 1 untuk sisiMiring, alas dan tinggi;
        JajaranGenjang jajaranGenjangdefault = new JajaranGenjang();
        System.out.println("Menampilkan informasi objek jajaranGenjang dengan Nilai default adalah 1 untuk sisiMiring, alas dan tinggi");
        System.out.println("Alas: " + jajaranGenjangdefault.alas);
        System.out.println("Tinggi: " + jajaranGenjangdefault.tinggi);
        System.out.println("Luas: " + jajaranGenjangdefault.getLuas());
        System.out.println("Keliling: " + jajaranGenjangdefault.getKeliling());
        System.out.println("Menampilkan informasi objek jajaranGenjang dengan Nilai alas 8, sisiMiring 6, dan tinggi 5");
        // Membuat objek jajaranGenjang dengan alas 8, sisiMiring 6, dan tinggi 5
        JajaranGenjang jajaranGenjangNotDefault = new JajaranGenjang(6, 8, 5);
        // Menampilkan informasi
        System.out.println("Alas: " + jajaranGenjangNotDefault.alas);
        System.out.println("Tinggi: " + jajaranGenjangNotDefault.tinggi);
        System.out.println("Luas: " + jajaranGenjangNotDefault.getLuas());
        System.out.println("Keliling: " + jajaranGenjangNotDefault.getKeliling());
    }
}

