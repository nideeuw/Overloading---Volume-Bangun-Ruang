/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Overloading;

/**
 *
 * @author MOKLET-2
 */
public class MainOverloading {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // memanggil method
        Volume bangun = new Volume();
        bangun.Volume("Menghitung Volume Bangun Ruang");
        System.out.println(" ");
        bangun.Volume(8, 8, 5);
        System.out.println("------------------");
        bangun.Volume(9);
        System.out.println("------------------");
        bangun.Volume(7, 13);
    }
    
}
