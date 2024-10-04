package dasprojobsheet6;
import java.util.Scanner;

public class Pemilihan2Percobaan214 {
    public static void main(String[] args) {
        
        Scanner empatbelas = new Scanner(System.in);
        int pilihan_menu;
        double diskon, harga, total_bayar;
        String member, pembayaran;

        System.out.println("________________________");
        System.out.println("===== MENU KAFE TI =====");
        System.out.println("________________________");
        System.out.println("1. Ricebowl");
        System.out.println("2. Ice Tea");
        System.out.println("3. Paket Bundling (Ricebowl + Ice Tea)");
        System.out.println("______________________________________");
        System.out.print("Masukkan angka dari menu yang di pilih = ");
        pilihan_menu = empatbelas.nextInt();
        empatbelas.nextLine();
        System.out.print("Apakah punya member (y/n) ? = ");
        member = empatbelas.nextLine();
        System.out.print("Pembayaran (qris/cash) : ");
        pembayaran = empatbelas.nextLine();
        System.out.println("______________________________________");

        if (member.equalsIgnoreCase("y")){
            diskon = 0.10;
            System.out.println("Besar diskon = 10%");
            if (pilihan_menu == 1){
                harga = 14000;
                System.out.println("Harga Ricebowl = " + harga);
            } else if (pilihan_menu == 2){
                harga = 3000;
                System.out.println("Harga Ice Tea = " + harga);
            } else if (pilihan_menu == 3){
                harga = 15000;
                System.out.println("Harga Bundling = " + harga);
            } else {
                System.out.println("Masukan pilihan menu yang benar");
                return;
            }
            total_bayar = harga - (harga * diskon);
            if (pembayaran.equalsIgnoreCase("qris")){
                total_bayar = total_bayar - 1000.0;
            }
            System.out.println("Total bayar setelah diskon = " + total_bayar);

        } else if (member.equalsIgnoreCase("n")){
            if (pilihan_menu == 1){
                harga = 14000;
                System.out.println("Harga Ricebowl = " + harga);
            } else if (pilihan_menu == 2){
                harga = 3000;
                System.out.println("Harga Ice Tea = " + harga);
            } else if (pilihan_menu == 3){
                harga = 15000;
                System.out.println("Harga Bundling = " + harga);
            } else {
                System.out.println("Masukan pilihan menu yang benar");
                return;
            }
            if (pembayaran.equalsIgnoreCase("qris")){
                    harga = harga - 1000.0;
            }
            System.out.println("Total bayar = " + harga);

        } else {
            System.out.println("Member tidak valid");
        }
        System.out.println("______________________________________");
    }   
}
