/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author User 21
 */
import java.util.Scanner;
public class Array1 {
    public static void main (String[] args){
        Scanner masuk=new Scanner(System.in);
        float nilai[]=new float[5];
        System.out.println("Masukan 5 buah data nilai");
            for (int i = 0; i < 5; i++){
                System.out.print("Data Ke-"+(i+1)+" = ");
                nilai[i] = masuk.nextFloat();
            }
            System.out.println("Data Nilai yang dimasukkan");
            for (int i = 0; i < 5; i++){
                System.out.println("Nilai ke-"+nilai[i]);
            }
    }
}
