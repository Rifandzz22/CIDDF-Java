/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author User 21
 */
public class DemoBuku {
    public static void main (String[] args){
         Buku a,b;
         a=new Buku();
         b=new Buku ();
         
         a.pengarang="Rinaldi Munir";
         a.judul="Matematika Diskrit";
         b.pengarang="Cara Menaklukan Dunia";
         b.judul="Fir'aun";
         System.out.println("Judul = "+a.judul+" Pengarang = "+a.pengarang);
         System.out.println("Judul = "+b.judul+" Pengarang = "+b.pengarang);
    }
}

class Buku {
    public String pengarang;
    public String judul;
    
}