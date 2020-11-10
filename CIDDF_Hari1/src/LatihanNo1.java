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
public class LatihanNo1 {
    public static void main (String[] args){
        Scanner masuk = new Scanner(System.in);
        int bil;
        int n;
        System.out.print("Masukan Bilangan = ");
        n = masuk.nextInt();
        for (bil = 1; bil <=n; bil++){
            System.out.print(bil);
        }
    }
}
