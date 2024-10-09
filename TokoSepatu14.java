package dasprojobsheet6;
import java.util.Scanner;

public class TokoSepatu14 {
    public static void main(String[] args) {
        
        Scanner spt = new Scanner(System.in);

        String merk, katergori;
        int ukuran, hargaSepatu=0;

        System.out.print("Masukan Merk (converse, sketcher, nike)               : ");
        merk = spt.nextLine().toLowerCase();
        System.out.print("Masukan Kategori (SlipOn/HighTop/Woman/Man/Kids/Adult): ");
        katergori = spt.nextLine().toLowerCase();
        System.out.print("Masukan Ukuran                                        : ");
        ukuran = spt.nextInt();

        if (merk.equals("converse")){
            if (katergori.equals("slipon")){
                if (ukuran >= 36){
                    if (ukuran <= 40){
                        hargaSepatu = 800000;
                    } else {
                        System.out.println("Merk atau Ukuran tidak valid");
                    }
                } else {
                    System.out.println("Merk atau Ukuran tidak valid");
                }
            } else if (katergori.equals("hightop")){
                if (ukuran >= 40){
                    if (ukuran <= 44){
                        hargaSepatu = 1200000;
                    } 
                } else {
                    System.out.println("Merk atau Ukuran tidak valid");
                }
            } else {
                System.out.println("Merk atau Ukuran tidak valid");
            }
        } else if (merk.equals("sketcher")){
            if (katergori.equals("woman")){
                if (ukuran >= 36){
                    if (ukuran <= 41){
                        hargaSepatu = 1000000;
                    } else {
                        System.out.println("Merk atau Ukuran tidak valid");
                    }
                } else {
                    System.out.println("Merk atau Ukuran tidak valid");
                }
            } else if (katergori.equals("man")){
                if (ukuran >= 41){
                    if (ukuran <= 44){
                        hargaSepatu = 1800000;
                    } else {
                        System.out.println("Merk atau Ukuran tidak valid");
                    }
                } else {
                    System.out.println("Merk atau Ukuran tidak valid");
                }
            } else {
                System.out.println("Merk atau Ukuran tidak valid");
            }
        } else if (merk.equals("nike")){
            if (katergori.equals("kids")){
                if (ukuran >= 36){
                    if (ukuran <= 40){
                        hargaSepatu = 750000;
                    } else {
                        System.out.println("Merk atau Ukuran tidak valid");
                    }
                } else {
                    System.out.println("Merk atau Ukuran tidak valid");
                }
            } else if (katergori.equals("adult")){
                if (ukuran >= 40){
                    if (ukuran <= 44){
                        hargaSepatu = 1500000;
                    } else {
                        System.out.println("Merk atau Ukuran tidak valid");
                    }
                } else {
                    System.out.println("Merk atau Ukuran tidak valid");
                }
            } else {
                System.out.println("Merk atau Ukuran tidak valid");
            }
        } 
        System.out.print("harganya adalah " + hargaSepatu);
    }
}
