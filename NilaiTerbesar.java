package dasprojobsheet6;
import java.util.Scanner;

public class NilaiTerbesar {
    public static void main(String[] args) {
        
        Scanner bil = new Scanner(System.in);

        int bil1, bil2, bil3, Terbesar;
        
        System.out.print("Masukan bilangan 1 : ");
        bil1 = bil.nextInt();
        System.out.print("Masukan bilangan 2 : ");
        bil2 = bil.nextInt();
        System.out.print("Masukan bilangan 3 : ");
        bil3 = bil.nextInt();

        Terbesar = bil1;

        if (bil2 > Terbesar){
            Terbesar = bil2;
        } 

        if (bil3 > Terbesar){
            Terbesar = bil3;
        }
        
        System.out.println("Bilangan Terbesar adalah " + Terbesar);
    }
}
