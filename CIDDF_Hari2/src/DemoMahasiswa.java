/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author User 21
 */
public class DemoMahasiswa {
    public static void main (String[] args) {
        Mahasiswa mhs=new Mahasiswa();
        mhs.setNRP(1234);
        mhs.setNama("Fandi");
        System.out.println("NRP : " + mhs.getNRP());
        System.out.println("Nama : " + mhs.getNama());
    }
}
