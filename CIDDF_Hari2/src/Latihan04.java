
/*
 Buat suatu program dengan menerapkan overload method untuk mencetak deret bilangan ganjil dan genap
dengan kriteria sebagai berikut.
a. masing - masing perhitungan dipecah menjadi method-method
b. method yang dibuat harus dengan nama yang sama namun dengan parameter (tipe data)
yang berbeda
buat main methodnya untuk menjalankan kedua method tersebut.
 */

import java.util.Scanner;
public class Latihan04 {
    public static void main (String[] args) {
       
}

class Nomor {
    
    private int ganjil;
    private int genap;
    
    public Nomor (int ganjil) {
        this.ganjil=ganjil;
    }
    
    public Nomor (int ganjil, int genap) {
        this.ganjil=ganjil;
        this.genap=genap;
    }
    public void isiNomor (int ganjil) {
        this.ganjil=ganjil;
    }
    public void isiNomor (int ganjil, int genap) {
        this.ganjil=ganjil;
        this.genap=genap;
    }
    
    public void lihatNomor() {
        System.out.println("Ganjil : "+ganjil);
        System.out.println("Genap = "+genap);
        System.out.println();
    }
}
