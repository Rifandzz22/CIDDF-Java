/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author User 21
 */
public class Lagu {
    private String band;
    private String judul;
    
    public void isiParam(String judul, String band) {
        this.judul=judul;
        this.band=band;
    }
    public void cetakKelayar() {
        if (judul==null && band==null) {
            return;
        } else {
            System.out.println("Judul = "+judul+"\nBand = "+band);
        }
    }
}
