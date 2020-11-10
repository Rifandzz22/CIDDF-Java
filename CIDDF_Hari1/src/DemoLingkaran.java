/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author User 21
 */
public class DemoLingkaran {
    public static void main (String[] args){
        Lingkaran circle=new Lingkaran();
        circle.isiJari(10.0);
        circle.getHasil();
        
    }
}

class Lingkaran {
    public double jari;
    
    public void isiJari(double jari){
        this.jari=jari;
    }
    public double getLuas() {
       return 3.14*jari*jari;
    }
    
    public double getKeliling() {
        return 2*3.14*jari; 
    }
    public void getHasil() {
        System.out.println("Jadi Luasnya : "+getLuas()+" Sedangkan Kelilingnya = "+getKeliling());
    }
}