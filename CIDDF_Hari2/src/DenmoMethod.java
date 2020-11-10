/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author User 18
 */
import java.util.Scanner;
public class DenmoMethod {
    public static void main(String[] args)
{
tugas obj = new tugas ();
for (int n = 1;n>0 ;n++ ) //melakukan perulangan sebanyak tak terhingga
{Scanner input = new Scanner(System.in);
obj.tampilmenu();
System.out.print("Masukkan Angka dari Menu diatas : ");
obj.bil = input.nextInt();

if (obj.bil==1) // menampilkan bilangan ganjil jika input = 1
{
System.out.println(" ");
System.out.println(" ");
System.out.println("*MENAMPILKAN BILANGAN GANJIL*");
System.out.print("masukkan angka: ");
obj.ganjil = input.nextInt();
System.out.print("Bilangan ganjil: ");
obj.tampilganjil(); // memanggil method bilangan ganjil
System.out.println(" ");
System.out.println(" ");


}else if (obj.bil==2) // menampilkan bil genap jika inputnya 2

{ System.out.println(" ");
System.out.println(" ");
//System.out.print("Masukkan Angka dari Menu diatas : ");
System.out.println("*MENAMPILKAN BILANGAN GENAP*");
System.out.print("masukkan angka: ");
obj.genap = input.nextInt();
System.out.print("Bilangan genap: ");
obj.tampilgenap(); // memanggil method bilangan genap
System.out.println(" ");
System.out.println(" ");

}else{
System.out.println(" ");
System.out.println("Input Invalid !"); // menampilkan pesan invalid jika inputan selain nomor yang ada di MENU

}
}


}
}


class tugas
{int bil,bil2,i,ganjil,genap;
int k = 1;
//method bilangan ganjil
public void tampilganjil(){
for(int i=1;i<=ganjil;i++){
if(i%2==1 )
System.out.print(i+" ");

}
}
//method bilangan genap
public void tampilgenap(){

for(int i=2;i<=genap;i++){
if(i%2==0 )

System.out.print(i+" ");
}
}

//method menu utama

public void tampilmenu(){
System.out.println("");
System.out.println(" MENU ");
System.out.println(" ====================================");
System.out.println(" 1. Menampilkan Bilangan Ganjil ");
System.out.println(" 2. Menampilkan Bilangan Genap ");

System.out.println(" ====================================");
System.out.println(" ");


}
}


