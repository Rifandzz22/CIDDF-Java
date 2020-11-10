/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author User 21
 */
public class Bejo {
    public static void main (String[] args) {
        superman bj=new superman();
        bj.memrogram();
        {
            System.out.println("Implementasi memrogram... tik tik");
        }
        bj.menembak();
        {
            System.out.println("Implementasi memnembak... dor dor");
        }
        bj.terbang();
        {
            System.out.println("Implementasi terbang... Zap");
        }
    }
}

interface programmer {
    void memrogram();
}
interface tentara {
    void menembak();
}
interface burung {
    void terbang();
    void buangKotoran();
}

class superman implements programmer, tentara, burung {
    public void memrogram(){};
    public void menembak(){};
    public void terbang(){};
    public void buangKotoran(){};
}