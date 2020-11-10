/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author User 21
 */
public class Latihan03 {
    public static void main (String[] args){
        int [][] piksel=new int[4][4];
        //Mengisi Elemen tertentu
        piksel[0][0]=1;
        piksel[0][1]=0;
        piksel[0][2]=0;
        piksel[0][3]=0;
      
        piksel[1][0]=0;
        piksel[1][1]=1;
        piksel[1][2]=0;
        piksel[1][3]=0;
        
        piksel[2][0]=0;
        piksel[2][1]=0;
        piksel[2][2]=1;
        piksel[2][3]=0;
        
        piksel[3][0]=0;
        piksel[3][1]=0;
        piksel[3][2]=0;
        piksel[3][3]=1;
        
        //Menampilkan elemen array
        
        for (int i = 0; i < 4; i++){
            for (int j = 0; j < 4; j++){
                System.out.print(piksel[i][j]+" ");
            }
            System.out.println(" ");
        }
            
    }
}
