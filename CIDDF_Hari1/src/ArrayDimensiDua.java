/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author User 21
 */

public class ArrayDimensiDua {
    public static void main (String[] args){
        int [][] piksel=new int[2][3];
        //Mengisi Elemen tertentu
        piksel[0][0]=70;
        piksel[0][1]=18;
        piksel[0][2]=45;
        piksel[1][0]=75;
        piksel[1][1]=66;
        piksel[1][2]=89;
        
        //Menampilkan elemen array
        
        for (int i = 0; i < 2; i++){
            for (int j = 0; j < 3; j++){
                System.out.print(piksel[i][j]+" ");
            }
            System.out.println(" ");
        }
            
    }
}
