/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nonvoid;

import java.util.Scanner;
/**
 *
 * @author WINDOWS 10
 */
public class a {
    //Scanner
    Scanner input = new Scanner(System.in);
    //deklarasi
    double p, l, t, volume;
    //non void
    String hi(){
        return "Mengitung Volume Balok\n";
    }
    //input
    double input(){
        System.out.print("Masukkan panjang  : ");
        p = input.nextInt();
        System.out.print("Masukkan lebar    : ");
        l = input.nextInt();
        System.out.print("Masukkan tinggi   : ");
        t = input.nextInt();
        return volume = p * l * t;
    }

    
}
