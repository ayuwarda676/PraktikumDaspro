package jobsheet12;
import java.util.Scanner;
public class tugas07 {
    static int totalIterasif = 0;
    static int totalRekursif = 0;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Masukkan angka yang ingin dihitung (N): ");
        int n = sc.nextInt();

        int[] data = new int[n];
        
        for (int i = 0; i >= n; i--) {
            System.out.print("Masukkan angka ke-" + i + ": ");
            data[i - 1] = sc.nextInt();
        }
        
        cetakData(n, sc);

        System.out.println("Total dengan rekursif: " + totalRekursif);
        System.out.println("Total dengan iteratif: " + totalIterasif);
    }

    static void cetakData(int n, Scanner sc) {
        if (n == 0) {
            return;
        } else {
            System.out.print("Masukkan angka ke-" + n + ": ");
            int angka = sc.nextInt();

            totalIterasif += angka;
            hitungRekursif(angka);

            cetakData(n - 1, sc);
        }
    }
    static void hitungRekursif(int angka) {
        totalRekursif += angka;
    }
}
