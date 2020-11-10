/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author User 21
 */
public class Operator {
    public static void main (String[] args){
        int A = 100, B = 30;
        int jumlah = A + B;
        int kurang = A - B;
        int kali = A * B;
        float bagi = A / B;
        int modulo = A % B;
        
        System.out.println("Hasil Penjumlahan : "+A+" + "+B+" = "+jumlah);
        System.out.println("Hasil Pengurangan : "+A+" - "+B+" = "+kurang);
        System.out.println("Hasil Perkalian : "+A+" x "+B+" = "+kali);
        System.out.println("Hasil Pembagian : "+A+" : "+B+" = "+bagi);
        System.out.println("Hasil Modulus : "+A+" % "+B+" = "+modulo);
    }
}
