/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package abstractclass;

/**
 *
 * @author Leman
 */
public class main {

    public static void main(String[] args) {
// membuat objek bangundatar dari class persegi
        bangundatar persegi = new persegi(100, 50);
// membuat objek bangundatar dari class lingkaran
        bangundatar lingkaran = new lingkaran(10);
// membuat objek bangundatar dari class segitiga
        bangundatar segitiga = new segitiga(100, 4);
        /* memanggil method draw */
        persegi.gambar();
        System.out.println("Luas Persegi Panjang: " + persegi.getLuas());
        lingkaran.gambar();
        System.out.println("Luas Lingkaran: " + lingkaran.getLuas());
        segitiga.gambar();
        System.out.println("Luas Segitiga: " + segitiga.getLuas());
    }
}
