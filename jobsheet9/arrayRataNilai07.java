package jobsheet9;
import java.util.Scanner;
public class arrayRataNilai07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double total = 0;
        double rata2;
        double totalLulus = 0, totalTidakLulus = 0;
        int jmlLulus = 0, jmlTidakLulus = 0;
        
        System.out.print("Masukkan jumlah Mahasiswa: ");
        int jmlMhs = sc.nextInt();
        int[] nilaiMhs = new int[jmlMhs];

        for (int i = 0; i < nilaiMhs.length; i++) {
            System.out.print("Masukkan nilai mahasiswa ke- " + (i + 1) + " : ");
            nilaiMhs[i] = sc.nextInt();
        }
        for (int i = 0; i < nilaiMhs.length; i++) {
            total += nilaiMhs[i];

            if (nilaiMhs[i] > 70) {
                totalLulus += nilaiMhs[i];
                jmlLulus++;
            } else {
                totalTidakLulus += nilaiMhs[i];
                jmlTidakLulus++;
            }

        }
        double rata2Lulus = totalLulus / jmlLulus;
        double rata2TidakLulus = totalTidakLulus / jmlTidakLulus;
        rata2 = total / nilaiMhs.length;

        System.out.println();
        System.out.println("Banyaknya Mahasiswa yang lulus: " + jmlLulus);
        System.out.println("Rata-rata nilai lulus: " + rata2Lulus);
        System.out.println("Rata-rata nilai tidak lulus: " + rata2TidakLulus);

        
    }
    
}
