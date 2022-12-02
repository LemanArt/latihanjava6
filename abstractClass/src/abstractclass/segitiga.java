/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package abstractclass;

/**
 *
 * @author Leman
 */
public class segitiga extends bangundatar {

    private int alas;
    private int tinggi;
    private int st;

    public segitiga(int alas, int tinggi) {
        this.alas = alas;
        this.tinggi = tinggi;
    }
  @Override
    public void gambar() {
        System.out.println("\nGambar Segitiga");
    }
    @Override
    public float getLuas() {
        return (this.alas * this.tinggi)/2;
    }
}
