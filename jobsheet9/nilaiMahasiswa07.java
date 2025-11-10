package jobsheet9;
import java.util.Scanner;
public class nilaiMahasiswa07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan banyaknya nilai mahasiswa: ");
        int jumlah = sc.nextInt();

        int[] nilai = new int[jumlah];
        int total = 0;

        for (int i = 0; i < jumlah; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-" + (i + 1) + ": ");
            nilai[i] = sc.nextInt();
            total += nilai[i];
        }

        double rataRata = (double) total / jumlah;
        int tertinggi = nilai[0];
        int terendah = nilai[0];

        for (int i = 1; i < jumlah; i++) {
            if (nilai[i] > tertinggi) {
                tertinggi = nilai[i];
            } else if (nilai[i] < terendah) {
                terendah = nilai[i];
            }
        }
        System.out.println();
        System.out.println("=== Hasil Data Nilai Mahasiswa ===");
        System.out.print("Semua nilai: ");
        for (int i = 0; i < jumlah; i++) {
            System.out.print(nilai[i] + " ");
        }
        System.out.println();
        System.out.println("Rata-rata nilai: " + rataRata);
        System.out.println("Nilai tertinggi: " + tertinggi);
        System.out.println("Nilai terendah : " + terendah);

        sc.close();
    }
}