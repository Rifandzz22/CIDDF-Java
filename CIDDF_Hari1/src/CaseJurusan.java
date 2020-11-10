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
public class CaseJurusan {
    public static void main (String[] args){
      Scanner masuk = new Scanner (System.in);
      int pil;
      System.out.print("Masukan Pilihan = ");
      pil = masuk.nextInt();
      switch (pil){
          case 1: System.out.println("Teknik Informatika");
                  break;
          case 2: System.out.println("Sistem Informasi");
                  break;
          case 3: System.out.println("Biologi");
                  break; 
          default: System.out.println("Pilihan Salah!");
                  break;
      }
    }
}
