package jobsheet10;
import java.util.Scanner;
public class quiz07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int donasi [][] = new int[3][4];
        int [] totalPerDaerah = new int[3];
        String kategori1 = "Makanan";
        String kategori2 = "Pakaian";
        String kategori3 = "Obat-obatan";
        
        System.out.println("=== Donasi Kategori Makanan ===");
        for (int i = 0; i < donasi.length; i++) {
            System.out.println("Masukkan donasi dari daerah ke-" + (i + 1));
            totalPerDaerah[i] = 0;
            for (int j = 0; j < donasi[i].length; j++) {
                System.out.print("Donasi untuk kategori " + kategori1 + " dari daerah ke-" + (j + 1) + ": ");
                donasi[i][j] = sc.nextInt();
                totalPerDaerah[i] += donasi[i][j];
            }
            System.out.println("Total donasi kategori " + kategori1 + ": " + totalPerDaerah[i]);
            sc.nextLine();


        }
        System.out.println("=== Donasi Kategori Pakaian ===");
        for (int i = 0; i < donasi.length; i++) {
            System.out.println("Masukkan donasi dari daerah ke-" + (i + 1));
            totalPerDaerah[i] = 0;
            for (int j = 0; j < donasi[i].length; j++) {
                System.out.print("Donasi untuk kategori " + kategori2 + " dari daerah ke-" + (j + 1) + ": ");
                donasi[i][j] = sc.nextInt();
                totalPerDaerah[i] += donasi[i][j];
            }
            System.out.println("Total donasi kategori " + kategori2 + ": " + totalPerDaerah[i]);
            sc.nextLine();
        }
        System.out.println("=== Donasi Kategori Obat-obatan ===");
        for (int i = 0; i < donasi.length; i++) {
            System.out.println("Masukkan donasi dari daerah ke-" + (i + 1));
            totalPerDaerah[i] = 0;
            for (int j = 0; j < donasi[i].length; j++) {
                System.out.print("Donasi untuk kategori " + kategori3 + " dari daerah ke-" + (j + 1) + ": ");
                donasi[i][j] = sc.nextInt();
                totalPerDaerah[i] += donasi[i][j];
            }
            System.out.println("Total donasi kategori " + kategori3 + ": " + totalPerDaerah[i]);
            sc.nextLine();
        }
        int tertinggi = totalPerDaerah[0];
        int terendah = totalPerDaerah[0];

        for (int i = 1; i < totalPerDaerah.length; i++) {
            if (totalPerDaerah[i] > tertinggi) {
                tertinggi = totalPerDaerah[i];
            } else if (totalPerDaerah[i] < terendah) {
                terendah = totalPerDaerah[i];
            }
        }

    }
}
            
        
        
    

    

