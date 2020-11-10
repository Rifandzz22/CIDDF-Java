/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author User 21
 */
public class DemoEnkapsulasi {
    public static void main (String[] args) {
        musikJpop obj = new musikJpop("Deposito", 2017);
        obj.showData();
        obj.setJudul("Hari");
        System.out.println("Judul lagu : " + obj.getJudul());
    }
}

class musikPop {
    private String judulLagu;
    
    protected void setJudul(String nama) {
    judulLagu = nama;
    }
    
    protected String getJudul (){
        return judulLagu;
    }
}
class musikJpop extends musikPop {
    private int tahunTerbit;
    
    musikJpop(String judul, int tahun) {
        setJudul(judul);
        tahunTerbit=tahun;
    }
    public void showData() {
        System.out.println("Judul Lagu : " + getJudul());
        System.out.println("Tahun Terbit : " + tahunTerbit);
    }
}

class musikJazz {
    private String penyanyi;
    
    public void setPenyanyi(String nama) {
        penyanyi = nama;
    }
    public String getPenyanyi() {
        return penyanyi;
    }
    public void showPenyanyi() {
        System.out.print("Penyanyi : "+ penyanyi);
    }
}