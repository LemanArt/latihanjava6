/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package abstractclass;

/**
 *
 * @author Leman
 */
import java.lang.Math;
public class lingkaran extends bangundatar {

    private int r;

    public lingkaran(int r) {
        this.r = r;
    }

    @Override
    public void gambar() {
        System.out.println("\nGambar Lingkaran");
    }

    @Override
    public float getLuas() {
        return (float) (Math.PI * r * r);
    }

}
