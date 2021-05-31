/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo.remidi;
import java.util.Scanner;
/**
 *
 * @author MOKLET-1
 */
public class Pilihan {
    
    void info(){
        Scanner input = new Scanner(System.in);
        
        
    System.out.println("");
    //Header Pilihan Sepatu
    System.out.println("          JAYA BARU          ");
    System.out.println("=============================");
    
    kasir cetak1 = new kasir("1.910 \t2. Adidas \t3. Nike \t4. Skechers"
                    + " \t5. Puma \t6. Reebok \t7. Vans \t8. Converse"
                    + " \t9. Fila", "1. Pria \t2. Wanita", "1. Olahraga"
                    + " \t2. Lari \t3. Santai \t4. Kantoran", "1. Black"
                    + " \t2. White \t3. Gold \t4. Silver \t5. Orange"
                    + " \t6. Green \t7. Yellow \t8. Blue \t9. Red");
    
    //pilihan merk sepatu
    System.out.println("\n    Daftar Harga Sepatu   ");
    int harga1 = 200000;
    System.out.println("[1] 910     \tRp" + harga1 + ",00");
    int harga2 = 300000;
    System.out.println("[2] Adidas  \tRp" + harga2 + ",00");
    int harga3 = 400000;
    System.out.println("[3] Nike    \tRp" + harga3 + ",00");
    int harga4 = 500000;
    System.out.println("[4] Skechers\tRp" + harga4 + ",00");
    int harga5 = 600000;
    System.out.println("[5] Puma    \tRp" + harga5 + ",00");
    int harga6 = 700000;
    System.out.println("[6] Reebok  \tRp" + harga6 + ",00");
    int harga7 = 750000;
    System.out.println("[7] Vans    \tRp" + harga7 + ",00");
    int harga8 = 800000;
    System.out.println("[8] Converse\tRp" + harga8 + ",00");
    int harga9 = 900000;
    System.out.println("[9] Fila    \tRp" + harga9 + ",00");
    
    System.out.println("\n");
    
    System.out.println("BELI 2 DISKON Rp50.000,00");
    System.out.println("BELI 3 DISKON Rp100.000,00");
    
    System.out.println("\n---------------------------");
    
    //pilihan jenis sepatu
    System.out.println("\n   Daftar Jenis Sepatu");
    System.out.println("[1] Pria");
    System.out.println("[2] Wanita");
    System.out.println("\n----------------------------");
    
    //pilihan kategori sepatu
    System.out.println("\n   Daftar Kategori Sepatu");
    System.out.println("[1] Olahraga");
    System.out.println("[2] Lari");
    System.out.println("[3] Santai");
    System.out.println("[4] Kantoran");
    System.out.println("\n----------------------------");
    
    //pilihan warna sepatu
    System.out.println("\n    Daftar Warna Sepatu   ");
    String warna1 = "Black";
    System.out.println("[1]\t" + warna1);
    String warna2 = "White";
    System.out.println("[2]\t" + warna2);
    String warna3 = "Gold";
    System.out.println("[3]\t" + warna3);
    String warna4 = "Silver";
    System.out.println("[4]\t" + warna4);
    String warna5 = "Orange";
    System.out.println("[5]\t" + warna5);
    String warna6 = "Green";
    System.out.println("[6]\t" + warna6);
    String warna7 = "Yellow";
    System.out.println("[7]\t" + warna7);
    String warna8 = "Blue";
    System.out.println("[8]\t" + warna8);
    String warna9 = "Red";
    System.out.println("[9]\t" + warna9);
    
    
    
    System.out.println("\n=============================");
    System.out.println("\nSILAHKAN PILIH SEPATU ANDA");
    System.out.println("\n=============================");
    
    
    System.out.print("\nMerk Sepatu\t: ");
    int merk = input.nextInt();
    if(merk > 9){
        System.out.print("Merk tidak tersedia, Pilih ulang : ");
        int merk2 = input.nextInt();
    }
    
    System.out.println("-----------------------------");
    System.out.print("\nJenis Sepatu\t: ");
    int jenis = input.nextInt();
    if(jenis > 2){
       System.out.print("Jenis tidak tersedia, Pilih ulang : ");
       int jenis2 = input.nextInt();
    }
    
    System.out.println("-----------------------------");
    System.out.print("\nKategori Sepatu\t: ");
    int kategori = input.nextInt();
    if(kategori > 4){
        System.out.print("Kategori tidak tersedia, Pilih ulang :");
        int kategori2 = input.nextInt();
    }
    
    System.out.println("-----------------------------");
    System.out.print("\nWarna Sepatu\t: ");
    int warna = input.nextInt();
    if(warna > 9){
        System.out.print("Warna tidak tersedia, Pilih ulang :");
        int warnaNew = input.nextInt();
    }
    
    System.out.print("\nUkuran Sepatu (25-34)\t: ");
    int ukuran = input.nextInt();
    if(ukuran > 34){
        System.out.print("Ukuran tidak tersedia, Pilih ulang :");
        int ukuran2 = input.nextInt();
    }
    if(ukuran < 25){
        System.out.print("Ukuran tidak tersedia, Pilih ulang :");
        int ukuran2 = input.nextInt();
    }
    
    System.out.print("\nJumlah Pembelian\t: ");
    int jumlah = input.nextInt();
    int diskon2 = 50000; //jika beli 2 pasang diskon Rp50.000,00
    int diskon3 = 100000; //jika beli 3 pasang diskon Rp100.000,00
    
    System.out.println("\n=========== JAYA BARU ===========");
    System.out.println("---------------------------------");
    System.out.println("30 Mei 2021                 15:00");
    System.out.println("Cashier                 Lintang A");
    System.out.println("---------------------------------");
    System.out.println("          *Order in Place        ");
    
    if(merk == 1){
        System.out.println("MERK SEPATU     : 910");
    }
    else if(merk == 2){
        System.out.println("MERK SEPARU     : ADIDAS");
    }
    else if(merk == 3){
        System.out.println("MERK SEPATU     : NIKE");
    }
    else if(merk == 4){
        System.out.println("MERK SEPATU     : SKECHERS");
    }
    else if(merk == 5){
        System.out.println("MERK SEPATU     : PUMA");
    }
    else if(merk == 6){
        System.out.println("MERK SEPATU     : REEBOK");
    }
    else if(merk == 7){
        System.out.println("MERK SEPATU     : VANS");
    }
    else if(merk == 8){
        System.out.println("MERK SEPATU     : CONVERSE");
    }
    else if(merk == 9){
        System.out.println("MERK SEPATU     : FILA");
    }
    
    if(jenis == 1){
        System.out.println("JENIS SEPATU    : PRIA");
    }
    else if(jenis == 2){
        System.out.println("JENIS SEPATU    : WANITA");
    }
    
    if(kategori == 1){
        System.out.println("KATEGORI SEPATU : OLAHRAGA");
    }
    else if(kategori == 2){
        System.out.println("KATEGORI SEPATU : LARI");
    }
    else if(kategori == 3){
        System.out.println("KATEGORI SEPATU : SANTAI");
    }
    else if(kategori == 4){
        System.out.println("KATEGORI SEPATU : KANTORAN");
    }
    
    if(warna == 1){
        System.out.println("WARNA SEPATU    : BLACK");
    }
    else if(warna == 2){
        System.out.println("WARNA SEPATU    : WHITE");
    }
    else if(warna == 3){
        System.out.println("WARNA SEPATU    : GOLD");
    }
    else if(warna == 4){
        System.out.println("WARNA SEPATU    : SILVER");
    }
    else if(warna == 5){
        System.out.println("WARNA SEPATU    : ORANGE");
    }
    else if(warna == 6){
        System.out.println("WARNA SEPATU    : GREEN");
    }
    else if(warna == 7){
        System.out.println("WARNA SEPATU    : YELLOW");
    }
    else if(warna == 8){
        System.out.println("WARNA SEPATU    : BLUE");
    }
    else if(warna == 9){
        System.out.println("WARNA SEPATU    : RED");
    }
    
    System.out.println("UKURAN SEPATU   : "+ukuran);
    System.out.println("JUMLAH SEPATU   : "+jumlah);
    
    if(merk == 1 && jumlah ==2){
        System.out.println("\nHARGA SEPATU   \t: Rp " + harga1 + " x " + jumlah);
        System.out.println("DISKON SEPATU  \t: Rp " + diskon2);
        System.out.println("TOTAL HARGA    \t: Rp " + ((harga1 * jumlah) - diskon2));
        System.out.print("\nPEMBAYARAN     \t: Rp ");
        int pembayaran = input.nextInt();
        System.out.println("\nKEMBALIAN      \t: Rp " + (pembayaran - ((harga1 * jumlah) - diskon2)));
    }
    else if(merk == 1 && jumlah >=3){
        System.out.println("\nHARGA SEPATU   \t: Rp " + harga1 + " x " + jumlah);
        System.out.println("DISKON SEPATU  \t: Rp " + diskon3);
        System.out.println("TOTAL HARGA    \t: Rp " + ((harga1 * jumlah) - diskon3));
        System.out.print("\nPEMBAYARAN     \t: Rp ");
        int pembayaran = input.nextInt();
        System.out.println("\nKEMBALIAN      \t: Rp " + (pembayaran - ((harga1 * jumlah) - diskon3)));
    }
    else if(merk == 2 && jumlah ==2){
        System.out.println("\nHARGA SEPATU   \t: Rp " + harga2 + " x " + jumlah);
        System.out.println("DISKON SEPATU  \t: Rp " + diskon2);
        System.out.println("TOTAL HARGA    \t: Rp " + ((harga2 * jumlah) - diskon2));
        System.out.print("\nPEMBAYARAN     \t: Rp ");
        int pembayaran = input.nextInt();
        System.out.println("\nKEMBALIAN      \t: Rp " + (pembayaran - ((harga2 * jumlah) - diskon2)));
    }
    else if(merk == 2 && jumlah >=3){
        System.out.println("\nHARGA SEPATU   \t: Rp " + harga2 + " x " + jumlah);
        System.out.println("DISKON SEPATU  \t: Rp " + diskon3);
        System.out.println("TOTAL HARGA    \t: Rp " + ((harga2 * jumlah) - diskon3));
        System.out.print("\nPEMBAYARAN     \t: Rp ");
        int pembayaran = input.nextInt();
        System.out.println("\nKEMBALIAN      \t: Rp " + (pembayaran - ((harga2 * jumlah) - diskon3)));
    }
    else if(merk == 3 && jumlah ==2){
        System.out.println("\nHARGA SEPATU   \t: Rp " + harga3 + " x " + jumlah);
        System.out.println("DISKON SEPATU  \t: Rp " + diskon2);
        System.out.println("TOTAL HARGA    \t: Rp " + ((harga3 * jumlah) - diskon2));
        System.out.print("\nPEMBAYARAN     \t: Rp ");
        int pembayaran = input.nextInt();
        System.out.println("\nKEMBALIAN      \t: Rp " + (pembayaran - ((harga3 * jumlah) - diskon2)));
    }
    else if(merk == 3 && jumlah >=3){
        System.out.println("\nHARGA SEPATU   \t: Rp " + harga3 + " x " + jumlah);
        System.out.println("DISKON SEPATU  \t: Rp " + diskon3);
        System.out.println("TOTAL HARGA    \t: Rp " + ((harga3 * jumlah) - diskon3));
        System.out.print("\nPEMBAYARAN     \t: Rp ");
        int pembayaran = input.nextInt();
        System.out.println("\nKEMBALIAN      \t: Rp " + (pembayaran - ((harga3 * jumlah) - diskon3)));
    }
    else if(merk == 4 && jumlah ==2){
        System.out.println("\nHARGA SEPATU   \t: Rp " + harga4 + " x " + jumlah);
        System.out.println("DISKON SEPATU  \t: Rp " + diskon2);
        System.out.println("TOTAL HARGA    \t: Rp " + ((harga4 * jumlah) - diskon2));
        System.out.print("\nPEMBAYARAN     \t: Rp ");
        int pembayaran = input.nextInt();
        System.out.println("\nKEMBALIAN      \t: Rp " + (pembayaran - ((harga4 * jumlah) - diskon2)));
    }
    else if(merk == 4 && jumlah >=3){
        System.out.println("\nHARGA SEPATU   \t: Rp " + harga4 + " x " + jumlah);
        System.out.println("DISKON SEPATU  \t: Rp " + diskon3);
        System.out.println("TOTAL HARGA    \t: Rp " + ((harga4 * jumlah) - diskon3));
        System.out.print("\nPEMBAYARAN     \t: Rp ");
        int pembayaran = input.nextInt();
        System.out.println("\nKEMBALIAN      \t: Rp " + (pembayaran - ((harga4 * jumlah) - diskon3)));
    }
    else if(merk == 5 && jumlah ==2){
        System.out.println("\nHARGA SEPATU   \t: Rp " + harga5 + " x " + jumlah);
        System.out.println("DISKON SEPATU  \t: Rp " + diskon2);
        System.out.println("TOTAL HARGA    \t: Rp " + ((harga5 * jumlah) - diskon2));
        System.out.print("\nPEMBAYARAN     \t: Rp ");
        int pembayaran = input.nextInt();
        System.out.println("\nKEMBALIAN      \t: Rp " + (pembayaran - ((harga5 * jumlah) - diskon2)));
    }
    else if(merk == 5 && jumlah >=3){
        System.out.println("\nHARGA SEPATU   \t: Rp " + harga5 + " x " + jumlah);
        System.out.println("DISKON SEPATU  \t: Rp " + diskon3);
        System.out.println("TOTAL HARGA    \t: Rp " + ((harga5 * jumlah) - diskon3));
        System.out.print("\nPEMBAYARAN     \t: Rp ");
        int pembayaran = input.nextInt();
        System.out.println("\nKEMBALIAN      \t: Rp " + (pembayaran - ((harga5 * jumlah) - diskon3)));
    }
    else if(merk == 6 && jumlah ==2){
        System.out.println("\nHARGA SEPATU   \t: Rp " + harga6 + " x " + jumlah);
        System.out.println("DISKON SEPATU  \t: Rp " + diskon2);
        System.out.println("TOTAL HARGA    \t: Rp " + ((harga6 * jumlah) - diskon2));
        System.out.print("\nPEMBAYARAN     \t: Rp ");
        int pembayaran = input.nextInt();
        System.out.println("\nKEMBALIAN      \t: Rp " + (pembayaran - ((harga6 * jumlah) - diskon2)));
    }
    else if(merk == 6 && jumlah >=3){
        System.out.println("\nHARGA SEPATU   \t: Rp " + harga6 + " x " + jumlah);
        System.out.println("DISKON SEPATU  \t: Rp " + diskon3);
        System.out.println("TOTAL HARGA    \t: Rp " + ((harga6 * jumlah) - diskon3));
        System.out.print("\nPEMBAYARAN     \t: Rp ");
        int pembayaran = input.nextInt();
        System.out.println("\nKEMBALIAN      \t: Rp " + (pembayaran - ((harga6 * jumlah) - diskon3)));
    }
    else if(merk == 7 && jumlah ==2){
        System.out.println("\nHARGA SEPATU   \t: Rp " + harga7 + " x " + jumlah);
        System.out.println("DISKON SEPATU  \t: Rp " + diskon2);
        System.out.println("TOTAL HARGA    \t: Rp " + ((harga7 * jumlah) - diskon2));
        System.out.print("\nPEMBAYARAN     \t: Rp ");
        int pembayaran = input.nextInt();
        System.out.println("\nKEMBALIAN      \t: Rp " + (pembayaran - ((harga7 * jumlah) - diskon2)));
    }
    else if(merk == 7 && jumlah >=3){
        System.out.println("\nHARGA SEPATU   \t: Rp " + harga7 + " x " + jumlah);
        System.out.println("DISKON SEPATU  \t: Rp " + diskon3);
        System.out.println("TOTAL HARGA    \t: Rp " + ((harga7 * jumlah) - diskon3));
        System.out.print("\nPEMBAYARAN     \t: Rp ");
        int pembayaran = input.nextInt();
        System.out.println("\nKEMBALIAN      \t: Rp " + (pembayaran - ((harga7 * jumlah) - diskon3)));
    }
    else if(merk == 8 && jumlah ==2){
        System.out.println("\nHARGA SEPATU   \t: Rp " + harga8 + " x " + jumlah);
        System.out.println("DISKON SEPATU  \t: Rp " + diskon2);
        System.out.println("TOTAL HARGA    \t: Rp " + ((harga8 * jumlah) - diskon2));
        System.out.print("\nPEMBAYARAN     \t: Rp ");
        int pembayaran = input.nextInt();
        System.out.println("\nKEMBALIAN      \t: Rp " + (pembayaran - ((harga8 * jumlah) - diskon2)));
    }
    else if(merk == 8 && jumlah >=3){
        System.out.println("\nHARGA SEPATU   \t: Rp " + harga8 + " x " + jumlah);
        System.out.println("DISKON SEPATU  \t: Rp " + diskon3);
        System.out.println("TOTAL HARGA    \t: Rp " + ((harga1 * jumlah) - diskon3));
        System.out.print("\nPEMBAYARAN     \t: Rp ");
        int pembayaran = input.nextInt();
        System.out.println("\nKEMBALIAN      \t: Rp " + (pembayaran - ((harga8 * jumlah) - diskon3)));
    }
    else if(merk == 9 && jumlah ==2){
        System.out.println("\nHARGA SEPATU   \t: Rp " + harga9 + " x " + jumlah);
        System.out.println("DISKON SEPATU  \t: Rp " + diskon2);
        System.out.println("TOTAL HARGA    \t: Rp " + ((harga9 * jumlah) - diskon2));
        System.out.print("\nPEMBAYARAN     \t: Rp ");
        int pembayaran = input.nextInt();
        System.out.println("\nKEMBALIAN      \t: Rp " + (pembayaran - ((harga9 * jumlah) - diskon2)));
    }
    else if(merk == 9 && jumlah >=3){
        System.out.println("\nHARGA SEPATU   \t: Rp " + harga9 + " x " + jumlah);
        System.out.println("DISKON SEPATU  \t: Rp " + diskon3);
        System.out.println("TOTAL HARGA    \t: Rp " + ((harga9 * jumlah) - diskon3));
        System.out.print("\nPEMBAYARAN     \t: Rp ");
        int pembayaran = input.nextInt();
        System.out.println("\nKEMBALIAN      \t: Rp " + (pembayaran - ((harga9 * jumlah) - diskon3)));
    }
    
    System.out.println("\n");
    System.out.println("---------- TERIMAKASIH TELAH BERBELANJA DI TOKO 'JAYA BARU' ----------");
    }
    
}
