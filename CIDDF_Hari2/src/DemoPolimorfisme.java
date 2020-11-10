/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author User 21
 */
public class DemoPolimorfisme {
        public static void main (String[]args) {
            Herbivora her;
            Kelinci k;
            Binatang b;
            her=new Herbivora();
            k=new Kelinci();
            b=her;
            b.info();
            b=k;
            b.info();
        }
}

class Binatang {
    public void info() {
        System.out.print("Info tentang Hewan");
    }
}
class Herbivora extends Binatang {
    public void info() {
        System.out.println("Info Herbivora : Memakan makanan berupa tumbuhan");
    }
}

class Kelinci extends Herbivora {
    public void info() {
        System.out.println("Info Kelinci : Memakan makanan berupa wortel");
    }
}