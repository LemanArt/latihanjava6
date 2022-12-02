/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package abstractclass;

/**
 *
 * @author Leman
 */
public class persegi extends bangundatar {

    private float height;
    private float width;

    public persegi(int width, int height) {
        this.height = height;
        this.width = width;
    }

    @Override
    public void gambar() {
        System.out.println("Gambar Persegi Panjang");
    }

    @Override
    public float getLuas() {
        return this.width * this.height;
    }
}
