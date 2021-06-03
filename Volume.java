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
public class Volume {
    
    public void Volume(String vol){
        System.out.println(" "+vol);
    }
    
    public void Volume(int panjang, int lebar, int tinggi){
        System.out.println("Panjang Balok   : "+panjang+" m");
        System.out.println("Lebar Balok     : "+lebar+" m");
        System.out.println("Tinggi Balok    : "+tinggi+" m");
        System.out.println("Volume Balok    : "+(panjang*lebar*tinggi+" m3"));
    }
    
    public void Volume(int s1){
        System.out.println("Sisi Kubus      : "+s1+" m");
        System.out.println("Volume Kubus    : "+(s1*s1*s1+" m3"));
    }
    
    public void Volume(int r, int t){
        System.out.println("Jari Jari Kerucut   : "+r+" m");
        System.out.println("Tinggi Kerucut      : "+t+" m");
        System.out.println("Volume Kerucut      : "+(Math.PI*r*r*t*1/3)+" m3");
    }
    
}
