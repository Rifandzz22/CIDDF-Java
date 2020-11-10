/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author User 21
 */
public class DemoOverloading {
    public static void main (String[] args) {
        Phone p1=new Phone();
        Phone p2=new Phone("Mito");
        Phone p3=new Phone("Iphone",3000);
        
        
        System.out.println("Perbedaan output dari masing - masing konstruktor");
        p1.lihatPhone();
        p2.lihatPhone();
        p3.lihatPhone();
        
        Phone p4,p5;
        p4=new Phone();
        p5=new Phone();
        
        p4.isiPhone("Xiaomi");
        p5.isiPhone("Iphone",10000);
        
        System.out.println("Perbedaan output dari masing - masing Methode");
        p4.lihatPhone();
        p5.lihatPhone();
    }
}

class Phone {
    
    private String merk;
    private int harga;
    
    public Phone() {
        
    }
    
    public Phone (String merk) {
        this.merk=merk;
    }
    
    public Phone (String merk, int harga) {
        this.merk=merk;
        this.harga=harga;
    }
    public void isiPhone (String merk) {
        this.merk=merk;
    }
    public void isiPhone (String merk, int harga) {
        this.merk=merk;
        this.harga=harga;
    }
    
    public void lihatPhone() {
        System.out.println("Merk = "+merk);
        System.out.println("Harga = "+harga);
        System.out.println();
    }
}