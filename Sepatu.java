/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo.remidi;

/**
 *
 * @author MOKLET-1
 */
public class Sepatu {
    private String merk;
    private String warna;
    private String jenis;
    private String kategori;
    
    public Sepatu(String merk, String jenis, String kategori, String warna){
        this.merk = merk;
        this.jenis = jenis;
        this.kategori = kategori;
        this.warna = warna;
    }
    
    public void info(){
        System.out.println("Merk              "+this.merk);
        System.out.println("Jenis             "+this.jenis);
        System.out.println("Kategori          "+this.kategori);
        System.out.println("Warna             "+this.warna);
    }
}
