/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author User 21
 */
public class DemoConstructor {
    public static void main (String[] args) {
        Kendaraan mobil=new Kendaraan(2);
        mobil.tampilJumlahRoda();
    }
}

class Kendaraan {
    int jumlah_roda;
    
    Kendaraan (int jml_roda) {
        jumlah_roda = jml_roda;
    }
    
    public void tampilJumlahRoda() {
        System.out.print(jumlah_roda);
    }
}
