package dasprojobsheet6;
import java.util.Scanner;

public class TokoBuku14 {
    public static void main(String[] args) {
        Scanner bku = new Scanner(System.in);

        String jenisBuku;
        int jmlBuku, diskon=0;

        System.out.print("Masukan jenis buku (kamus/novel/lainnya): ");
        jenisBuku = bku.nextLine().toLowerCase();
        System.out.print("Masukan jumlah buku                     : ");
        jmlBuku = bku.nextInt();

        if (jenisBuku.equals("kamus") || jenisBuku.equals("novel")){
            if (jenisBuku.equals("kamus")) {
            diskon = 10;
            if (jmlBuku > 2) {
                diskon += 2;
            }
            } else if (jenisBuku.equals("novel")) {
            diskon = 7;
            if (jmlBuku > 3) {
                diskon += 2;
            } else if (jmlBuku <= 3) {
                diskon += 1;
            }
        } 
        }else {
            if (jmlBuku > 3) {
                diskon = 5;
            }
        }
        System.out.println("jumlah diskon adalah " + diskon + " persen");
    }
}
